package thread;

import static java.lang.Thread.sleep;

/**
 * @author cuihaoran
 * @date 2020/6/18-9:20
 */
public class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        for (; ; ) {
            System.out.println("good News!");
            try {
                sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
