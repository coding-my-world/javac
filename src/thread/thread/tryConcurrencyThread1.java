package thread.thread;

import thread.MyThread;

import static java.lang.Thread.sleep;

/**
 * @author cuihaoran
 * @date 2020/6/18-9:09
 */
public class tryConcurrencyThread1 {
    public static void main(String[] args) throws InterruptedException {

        // 创建另外的一个线程，执行看新闻的任务
        MyThread thread = new MyThread("thread-browseNews");
        // 启动线程
        thread.start();
        // 在主线程里，听音乐
        enjoyMusic();

    }

    /**
     * 听音乐
     */
    private static void enjoyMusic() throws InterruptedException {
        for (; ; ) {
            System.out.println("oh.the good music.");
            sleep(1);
        }
    }

}
