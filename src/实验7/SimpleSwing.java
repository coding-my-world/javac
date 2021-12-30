package 实验7;

/**
 * @author cuihaoran
 * @date 2020/6/18-15:11
 */
class Thread1 implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (tickets > 0) {
            System.out.println(Thread.currentThread().getName()
                    + " is saling tickets " + tickets--);
        }
    }
}

public class SimpleSwing {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}