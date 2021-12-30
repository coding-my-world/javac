package 实验7;

/**
 * @author cuihaoran
 * @date 2020/6/18-14:10
 */
public class MultiThreadDemo1 {
    public static void main(String[] args) {
        new Thread("1");
        new Thread("2");
        new Thread("3");
        new Thread("4");
        System.out.println("主线程启动！");
        for (int i = 0; i < 100; i++) {
            System.out.print("-->");
        }
        System.out.println("主线程结束");
    }
}

class NewThread implements Runnable {
    private Thread t;
    private String name;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.print("新线程" + name + "启动");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name);
        }
        System.out.print("线程" + name + "结束！");
    }
}
