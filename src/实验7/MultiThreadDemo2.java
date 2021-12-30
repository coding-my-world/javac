package 实验7;

/**
 * @author cuihaoran
 * @date 2020/6/18-15:07
 */
public class MultiThreadDemo2 {
    public static void main(String[] args) {
        //运行子线程
        Thread t1, t2, t3, t4;
        t1 = new Thread(new NewSleepThread("1"));
        t1.start();
        t2 = new Thread(new NewSleepThread("2"));
        t2.start();
        t3 = new Thread(new NewSleepThread("3"));
        t3.start();
        t4 = new Thread(new NewSleepThread("4"));
        t4.start();
        //运行主线程
        System.out.println("主线程启动！");
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(" --> ");
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            System.out.println("主线程中断！");
        }
        System.out.println("主线程结束！");
    }
}

class NewSleepThread implements Runnable {
    private String name;

    NewSleepThread(String threadName) {
        name = threadName;
        System.out.println("新线程" + name + "启动！");
    }

    //线程入口
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(name);
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            System.out.println("线程" + name + "中断！");
        }
        System.out.println("线程" + name + "结束");
    }
}
