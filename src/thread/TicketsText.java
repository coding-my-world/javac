package thread;

/**
 * @author cuihaoran
 * @date 2020/6/18-10:28
 */
public class TicketsText {
    public static void main(String[] args) {
        //new TicketsThread("1").start();
        //new TicketsThread("2").start();
        //new TicketsThread("3").start();
        //new TicketsThread("4").start();
        TicketsRunnable ticketsRunnable = new TicketsRunnable();
        Thread thread1 = new Thread(ticketsRunnable, "1");
        thread1.start();
        Thread thread2 = new Thread(ticketsRunnable, "2");
        thread2.start();
        Thread thread3 = new Thread(ticketsRunnable, "3");
        thread3.start();
        Thread thread4 = new Thread(ticketsRunnable, "4");
        thread4.start();
    }

}
