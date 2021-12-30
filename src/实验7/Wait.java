package 实验7;

/**
 * @author cuihaoran
 * @date 2020/6/18-15:14
 */
class MyObject implements Runnable {
    private Monitor monitor;

    public MyObject(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        try {
            System.out.println("I'm going.");
            Thread.sleep(3000);
            monitor.gotMessage();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Monitor implements Runnable {
    private volatile boolean go = false;

    public synchronized void gotMessage() throws InterruptedException {
        go = true;
        notify();
    }

    public synchronized void watching() throws InterruptedException {
        if (go == false) {
            wait();
            System.out.println("He has gone.");
        }
    }

    @Override
    public void run() {
        try {
            watching();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Wait {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        MyObject o = new MyObject(monitor);
        new Thread(o).start();
        new Thread(monitor).start();
    }
}

