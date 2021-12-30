package 实验7;

/**
 * @author cuihaoran
 * @date 2020/6/18-14:21
 */
public class SimpleThreads {
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    public static void main(String[] args) throws InterruptedException {
        long patience = 1000 * 60 * 60;
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }
        threadMessage("StartingMessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();
        threadMessage("Waiting forMessageLoop thread to finish");
        while (t.isAlive()) {
            threadMessage("still waiting......");
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience) &&
                    t.isAlive()) {
                threadMessage("Tired of Waiting!");
                t.interrupt();
            }
        }
        threadMessage("Finally!");
    }

    private static class MessageLoop implements Runnable {
        public void run() {
            String importantInfo[] = {
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too "
            };
            try {
                for (int i = 0; i < importantInfo.length; i++) {
                    Thread.sleep(4000);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }
}
