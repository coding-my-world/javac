package 实验7;

/**
 * @author cuihaoran
 * @date 2020/6/18-12:23
 */
public class MyThread extends Thread {
    public MyThread() {
        super();
    }

    public MyThread(String threadName) {
        setName(threadName);
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "启动");
        MyThread thread1 = new MyThread("线程1");
        MyThread thread2 = new MyThread("线程2");
        MyThread thread3 = new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public void run() {
        System.out.println(this.getName() + "启动");
    }
}
