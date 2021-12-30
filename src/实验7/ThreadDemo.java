package 实验7;

/**
 * @author cuihaoran
 * @date 2020/6/18-15:10
 */
class ThreadTest extends Thread {
    private int tickets = 100;

    public ThreadTest(String name) {
        super(name);
    }

    public void run() {
        while (tickets > 0) {
            System.out.println(Thread.currentThread().getName()
                    + " is saling ticket " + tickets--);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new ThreadTest("1").start();
        new ThreadTest("2").start();
        new ThreadTest("3").start();
        new ThreadTest("4").start();


    }
}
