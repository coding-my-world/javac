package thread;

/**
 * @author cuihaoran
 * @date 2020/6/18-11:28
 */
public class JoinText {
    public static void main(String[] args) throws InterruptedException {
        Thread b = new Thread(new Tempjoin());
        b.start();
        b.join(1000);
        System.out.println("join finish");
    }
}

class Tempjoin implements Runnable {

    @Override
    public void run() {
        System.out.println("begin sleep");
        try {
            Thread.sleep(2200);
            System.out.println("end sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
