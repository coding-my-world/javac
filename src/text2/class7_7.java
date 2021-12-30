package text2;

import java.util.Scanner;

/**
 * 登录程序
 *
 * @author cuihaoran
 * @date 2020/5/21-15:06
 */
public class class7_7 {
    public static void main(String[] args) {
        String account = "123456";
        String key = "654321";
        Scanner s = new Scanner(System.in);


        int number = 0;
        do {
            String account1 = s.next();
            String key1 = s.next();

            number++;
            if (account1.equals(account) && key1.equals(key)) {
                System.out.println("欢迎");
                break;
            } else if (number == 3) {
                System.out.println("退出系统");
                break;
            }
        } while (true);
    }
}
