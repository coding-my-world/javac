package thread;

/**
 * @author cuihaoran
 * @date 2020/6/18-10:43
 */
public class TicketsRunnable implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + " is saling ticket" + tickets--);
        }
    }
}
