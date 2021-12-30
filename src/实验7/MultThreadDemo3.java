package 实验7;

/**
 * @author cuihaoran
 * @date 2020/6/18-15:09
 */
public class MultThreadDemo3 {
    public static void main(String[] args) {
        //运行子线程
        new NewPriorityThread("1", 1);
        new NewPriorityThread("2", 5);
        new NewPriorityThread("3", 5);
        new NewPriorityThread("4", 10);
        //运行主线程
        System.out.println("主线程启动！");
        for (int i = 0; i < 100; i++) {
            System.out.println(" --> ");
        }
        System.out.println("主线程结束！");
    }
}

class NewPriorityThread implements Runnable {
    private Thread t;
    private String name;

    NewPriorityThread(String threadName, int n) {
        name = threadName;
        t = new Thread(this, name);
        t.setPriority(n);
        System.out.println("新线程" + name + "启动！");
        t.start();
    }

    //线程入口
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name);
        }
        System.out.println("线程" + name + "结束");
    }
}
