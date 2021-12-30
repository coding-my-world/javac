package thread.thread;

import thread.MyThreadRunnable;

/**
 * @author cuihaoran
 * @date 2020/6/18-9:27
 */
public class tryConcurrencyThread2 {
    public static void main(String[] args) {
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread thread = new Thread(myThreadRunnable, "Thread1");

        thread.start();
        thread.run();
    }
}
