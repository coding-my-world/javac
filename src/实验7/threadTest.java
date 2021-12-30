package 实验7;

/**
 * @author cuihaoran
 * @date 2020/6/18-15:15
 */
class Exercise6_1 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 15; i++) {
                System.out.print("* ");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class threadTest {
    public static void main(String[] args) {
        Exercise6_1 exercise6_1 = new Exercise6_1();
        Thread t = new Thread(exercise6_1);
        t.start();
    }
}
