package text3;


import java.util.Scanner;

/**
 * 测试类
 *
 * @author cuihaoran
 * @date 2020/6/1-10:57
 */
public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean a = true;
        while (a == true) {
            liebiao();
            String choice1 = s.next();
            if (choice1.equals("1")) {
                Teacher teacher = new Teacher("0", "0", "0", "0");
                laoshi();
                teacher.shuru(s.next(), s.next(), s.next(), s.next());
            } else if (choice1.equals("2")) {
                student student = new student("0", "0", "0", "0");
                xuesheng();
            }
        }

    }

    public static void liebiao() {
        System.out.println("输入1对老师数据进行操作，2对学生进行操作");
    }

    public static void laoshi() {
        System.out.println("请输入编号，名字，职位，部门:");
    }

    public static void xuesheng() {
        System.out.println("请输入编号，名字，班号，成绩:");
    }


}

