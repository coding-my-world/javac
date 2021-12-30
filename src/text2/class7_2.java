package text2;

import java.util.Random;
import java.util.Scanner;

/**
 * 彩票
 *
 * @author cuihaoran
 * @date 2020/5/21-8:14
 */
public class class7_2 {
    public static void main(String[] args) {
        Random r = new Random();
        int one = r.nextInt(100) + 1;
        int two = r.nextInt(100) + 1;
        int three = r.nextInt(100) + 1;
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if (input == one) {
            System.out.println("一等奖为" + one);
            System.out.println("中奖了");
        } else if (input == two) {
            System.out.println("二等奖为" + two);
            System.out.println("中奖了");

        } else if (input == three) {
            System.out.println("三等奖为" + three);
            System.out.println("中奖了");
        } else {
            System.out.println("没中奖");
            System.out.println("一等奖为" + one);
            System.out.println("二等奖为" + two);
            System.out.println("三等奖为" + three);
        }
    }
}
