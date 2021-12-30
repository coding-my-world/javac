package 图书管理系统;

import java.util.Scanner;

/**
 * 测试类
 *
 * @author cuihaoran
 * @date 2020/6/1-15:42
 */
public class Test {
    static final int Max = 5;
    static book[] s = new book[Max];

    public static void main(String[] args) {

        first();
        menu();
        boolean a = true;
        while (a == true) {
            Scanner s1 = new Scanner(System.in);
            String choice = s1.next();
            switch (choice) {
                case "1":
                    outname();
                    menu();
                    break;
                case "2":
                    System.out.println("请输入归还书的名字");
                    String name1 = s1.next();
                    back(name1);
                    break;
                case "3":
                    System.out.println("亲输入要借的书：");
                    String name2 = s1.next();
                    out(name2);
                    break;
                case "4":
                    System.out.println("请输入要查询的书类：");
                    String name3 = s1.next();
                    find(name3);
                    break;
                case "5":
                    a = false;
                    System.out.println("退出系统！");
                    break;
            }

        }

    }

    public static void menu() {
        System.out.println("|*****************************************|");
        System.out.println("|*欢迎使用图书管理系统，请输入你要选择的功能*|");
        System.out.println("|*1.查看全部图书***************************|");
        System.out.println("|*2.归还图书*******************************|");
        System.out.println("|*3.借阅图书*******************************|");
        System.out.println("|*4.查找书目*******************************|");
        System.out.println("|*5.退出系统*******************************|");
        System.out.println("|*****************************************|");
    }

    public static void first() {
        s[0] = new book("西游记", "四大名著", 5);
        s[1] = new book("水浒传", "四大名著", 6);
        s[2] = new book("百年孤独", "外国名著", 7);
        s[3] = new book("兵器概论", "军事", 8);
        s[4] = new book("孙子兵法", "军事", 9);
    }

    public static void outname() {
        for (int i = 0; i < Max; i++) {
            System.out.println("名字:" + s[i].getName() + "，种类：" + s[i].getSort() + "，剩下的数量：" + s[i].getCount());
        }
    }

    public static void back(String name1) {

        if (name1.equals("西游记")) {
            int number1 = s[0].getCount();
            s[0] = new book("西游记", "四大名著", number1 + 1);
        } else if (name1.equals("水浒传")) {
            int number2 = s[1].getCount();
            s[1] = new book("水浒传", "四大名著", number2 + 1);

        } else if (name1.equals("百年孤独")) {
            int number3 = s[2].getCount();
            s[2] = new book("水浒传", "四大名著", number3 + 1);
        } else if (name1.equals("兵器概论")) {
            int number4 = s[3].getCount();
            s[3] = new book("水浒传", "四大名著", number4 + 1);
        } else if (name1.equals("孙子兵法")) {
            int number5 = s[4].getCount();
            s[4] = new book("水浒传", "四大名著", number5 + 1);
        }
        menu();
    }

    public static void out(String name2) {
        if (name2.equals("西游记")) {
            int number1 = s[0].getCount();
            s[0] = new book("西游记", "四大名著", number1 - 1);
            System.out.println("借书成功！");
        } else if (name2.equals("水浒传")) {
            int number2 = s[1].getCount();
            s[1] = new book("水浒传", "四大名著", number2 - 1);
            System.out.println("借书成功！");
        } else if (name2.equals("百年孤独")) {
            int number3 = s[2].getCount();
            s[2] = new book("百年孤独", "外国名著", number3 - 1);
            System.out.println("借书成功！");
        } else if (name2.equals("")) {
            int number4 = s[3].getCount();
            s[3] = new book("兵器概论", "军事", number4 - 1);
            System.out.println("借书成功！");
        } else if (name2.equals("孙子兵法")) {
            int number5 = s[4].getCount();
            s[4] = new book("孙子兵法", "军事", number5 - 1);
            System.out.println("借书成功！");
        }
        menu();

    }

    public static void find(String name3) {
        if (name3.equals("四大名著")) {
            System.out.println("西游记和水浒传");
        } else if (name3.equals("军事")) {
            System.out.println("兵器概论和孙子兵法");
        } else if (name3.equals("外国名著")) {
            System.out.println("百年孤独");
        }
        menu();
    }

}
