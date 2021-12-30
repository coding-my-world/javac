package 实验7;

/**
 * @author cuihaoran
 * @date 2020/6/18-12:29
 */
public class MyRunnable implements Runnable {
    public static void main(String[] args) {
        MyRunnable t1 = new MyRunnable();
        MyRunnable t2 = new MyRunnable();
        Thread thread1 = new Thread(t1, "MyThread");
        Thread thread2 = new Thread(t2);
        thread2.setName("MyThread2");
        thread1.start();
        thread2.start();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
