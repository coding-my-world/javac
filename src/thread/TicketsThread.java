package thread;

/**
 * @author cuihaoran
 * @date 2020/6/18-10:11
 */
public class TicketsThread extends Thread {
    private int tickets = 100;

    public TicketsThread(String name) {
        super(name);

    }

    @Override
    public void run() {
        while (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + " is saling ticket" + tickets--);
        }
    }
}
