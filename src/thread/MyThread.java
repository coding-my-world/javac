package thread;

/**
 * @author cuihaoran
 * @date 2020/6/18-8:43
 */
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    private static void enjoyMusic() throws InterruptedException {
        for (; ; ) {
            System.out.println("good music!");
            sleep(2);
        }
    }

    @Override
    public void run() {
        try {
            enjoyMusic();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
