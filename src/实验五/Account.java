package 实验五;

import java.util.Scanner;

/**
 * @author cuihaoran
 * @date 2020/6/17-14:50
 */
class MyException1 extends Exception {

    public String toString() {

        return "该账户不可透支，本次交易中断";
    }
}

public class Account {
    static int balance = 100000000;
    static boolean bool = true;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (bool) {
            menu();
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    qukuan();
                    break;
                case 2:
                    cunkuan();
                    break;
                case 3:
                    yu_e();
                    break;
                case 4:
                    bool = false;
            }

        }


    }

    static void Check(int number) throws MyException1 {
        if (number < 0) {
            throw new MyException1();

        } else {
            System.out.println("正在操作，请稍后。。。。！");
            System.out.println("[√]：操作成功");

        }


    }

    public static void menu() {
        System.out.println("                    银行卡操作界面  ");
        System.out.println("                     ————————————  ");
        System.out.println("                     [取款————1]");
        System.out.println("                     [存款————2]");
        System.out.println("                     [余额————3]");
        System.out.println("                     [退卡————0]");
        System.out.print("请输入：");
    }

    public static void qukuan() {
        System.out.println("请输入取款数");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a > balance) {
            bool = false;
        }
        try {
            Check(balance - a);
        } catch (MyException1 e) {

            System.out.println(e.toString());
        } finally {
            balance = balance - a;
        }
    }

    public static void cunkuan() {
        System.out.println("请输入存款数：");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("正在验钞，请稍候。。。。。！");
        System.out.println("[√]:操作成功");
        balance = balance + a;
    }

    public static void yu_e() {
        System.out.println(balance);
    }

}