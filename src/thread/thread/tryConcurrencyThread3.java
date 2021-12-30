package thread.thread;

/**
 * @author cuihaoran
 * @date 2020/6/18-9:58
 */
public class tryConcurrencyThread3 {
    public static void main(String[] args) {
        new Thread() {
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
        }.start();

    }

}
