package thread;

import static java.lang.Thread.sleep;

/**
 * 尝试并发
 *
 * @author cuihaoran
 * @date 2020/6/18-8:08
 */
public class tryConcurrency {
    public static void main(String[] args) throws InterruptedException {
        browseNews();
    }

    private static void browseNews() throws InterruptedException {
        for (; ; ) {
            System.out.println("good News!");
            sleep(2);
        }

    }
}
