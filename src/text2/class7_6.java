package text2;

import java.util.Scanner;

/**
 * 回文
 *
 * @author cuihaoran
 * @date 2020/5/21-10:53
 */
public class class7_6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        StringBuffer b = new StringBuffer(a);
        char[] x = a.toCharArray();
        char[] y = new char[a.length()];

        for (int i = 0; i < a.length(); i++) {
            y[i] = x[a.length() - i - 1];
        }
        boolean q = true;
        for (int i = 0; i < a.length(); i++) {

            if (x[i] != y[i]) {
                q = false;
                break;
            }
        }
        if (q == true) {
            System.out.println(a + "是回文数");
        } else System.out.println(a + "不是回文数");
        StringBuffer b2 = b.reverse();
        if (b2 == b) {
            System.out.println(b + "是回文数");
        } else System.out.println(b + "不是回文数");


    }
}
