
package 实验四;

import java.util.Scanner;

/**
 * 实现管理系统的测试类
 *
 * @author cuihaoran
 * @date 2020/6/6-14:56
 */
public class Text3 {                                      //创建text3类进行编写工资管理系统的主要内容
    static final int Max = 100;                             //静态初始化Max并定义两个数组用于分别储存为普通员工和管理人员
    static CommonEmployee[] s1 = new CommonEmployee[Max];   //的所有信息
    static Manager[] s2 = new Manager[Max];

    public static void main(String[] args) {

        for (int i = 0; i < Max; i++) {
            s1[i] = new CommonEmployee();
            s2[i] = new Manager();
            s1[i].name = "0";
            s2[i].name = "0";
        }
        s1[0].name = "张三";
        s1[0].sex = "男";
        s1[0].age = 28;
        s1[0].basic_position = 2000;
        s1[0].prizeMoney = 3000;
        s1[0].call_back_pay = 1000;
        s2[0].name = "李四";
        s2[0].sex = "男";
        s2[0].age = 27;
        s2[0].basic_position = 5000;
        s2[0].prizeMoney = 3000;
        s2[0].call_back_pay = 2000;
        CommonEmployee commonEmployee = new CommonEmployee();
        Manager manager = new Manager();
        //初始化数组
        menu();                                            //弹出菜单
        boolean a = true;                                     //使用循环使系统可以反复执行功能
        while (a) {
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {                                 //根据用户输入的内容进行选择功能
                case 1:
                    output1();
                    menu();
                    break;              //查看全部普通员工信息
                case 2:
                    increase1();
                    menu();
                    break;            //)添加普通员工
                case 3:
                    System.out.println("请输入你的姓名：");//普通员工工资结算
                    String choiceName = s.next();
                    for (int i = 0; i < Max; i++) {
                        if (s1[i].name.equals("0")) {
                            break;
                        }

                        if (choiceName.equals(s1[i].name)) {
                            System.out.print(s1[i].name + "的工资为：");
                            System.out.println(commonEmployee.sumSalary(s1[i].basic_position, s1[i].prizeMoney, s1[i].call_back_pay));
                        }
                    }
                    menu();
                    break;
                case 4:
                    output2();
                    menu();
                    break;                  //)查看全部管理人员信息；
                case 5:
                    increase2();
                    menu();
                    break;                   //添加管理人员
                case 6:
                    System.out.println("请输入你的姓名：");//管理人员工资结算
                    for (int i = 0; i < Max; i++) {
                        if (s2[i].name.equals("0")) {
                            break;
                        }
                        String choiceName2 = s.next();
                        if (choiceName2.equals(s2[i].name)) {
                            System.out.print(s2[i].name + "的工资为：");
                            System.out.println(commonEmployee.sumSalary(s2[i].basic_position, s2[i].prizeMoney, s2[i].call_back_pay));
                        }
                    }
                    menu();
                    break;
                case 7:
                    a = false;
                    System.out.println("欢迎下次使用");
                    break;

            }
        }
    }


    public static void menu() {                                                  //菜单方法
        System.out.println("|*********************************************|");
        System.out.println("|*欢迎使用工资结算管理系统，请输入你要选择的功能*|");
        System.out.println("|*1.查看全部普通员工的信息**********************|");
        System.out.println("|*2.添加普通员工*******************************|");
        System.out.println("|*3.普通员工工资结算***************************|");
        System.out.println("|*4.查看全部管理人员信息***********************|");
        System.out.println("|*5.添加管理人员*******************************|");
        System.out.println("|*6.管理人员工资结算***************************|");
        System.out.println("|*7.退出系统***********************************");
        System.out.println("|*********************************************|");
    }

    public static void initialize() {                        //初始化方法

    }

    public static void output1() {                           //查看全部普通员工信息

        for (int i = 0; i < Max; i++) {
            if (s1[i].name.equals("0")) {
                break;
            }
            System.out.println("名字：" + s1[i].name + "，性别：" + s1[i].sex + ",年龄:" + s1[i].age);
        }
    }

    public static void increase1() {                        //添加普通员工
        int length1 = 0;
        for (int i = 0; i < Max; i++) {
            if (s1[i].name.equals("0")) {
                break;
            }
            length1++;
        }

        System.out.println("请输入你要增加的普通员工的全部信息");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String sex = scanner.next();
        int age = scanner.nextInt();
        int basic_position = scanner.nextInt();
        int prizeMoney = scanner.nextInt();
        int call_back_pay = scanner.nextInt();
        s1[length1].name = name;
        s1[length1].sex = sex;
        s1[length1].age = age;
        s1[length1].basic_position = basic_position;
        s1[length1].prizeMoney = prizeMoney;
        s1[length1].call_back_pay = call_back_pay;

        System.out.println("添加成功");
    }


    public static void output2() {                  //)查看全部管理人员信息；

        for (int i = 0; i < Max; i++) {
            if (s2[i].name == "0") {
                break;
            }
            System.out.println("名字：" + s2[i].name + "，性别：" + s2[i].sex + ",年龄:" + s2[i].age);
        }
    }

    public static void increase2() {                     //添加管理人员
        int length2 = 0;
        for (int i = 0; i < Max; i++) {
            if (s2[i].name == "0") {
                break;
            }
            length2++;
        }
        System.out.println("请输入你要增加的普通员工的全部信息");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String sex = scanner.next();
        int age = scanner.nextInt();
        int basic_position = scanner.nextInt();
        int prizeMoney = scanner.nextInt();
        int call_back_pay = scanner.nextInt();
        s2[length2].name = name;
        s2[length2].sex = sex;
        s2[length2].age = age;
        s2[length2].basic_position = basic_position;
        s2[length2].prizeMoney = prizeMoney;
        s2[length2].call_back_pay = call_back_pay;

        System.out.println("添加成功");
    }


}

