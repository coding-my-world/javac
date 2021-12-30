package text666666;

import java.util.Scanner;

/**
 * @author cuihaoran
 * @date 2020/6/12-8:34
 */
public class word {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 67;
        a[1] = 87;
        a[2] = 56;
        a[3] = 78;
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        boolean b = true;
        for (int i = 0; i < a.length; i++) {
            if (choice == a[i]) {
                System.out.println(choice);
                b = false;
            }

        }
        if (b) {
            System.out.println("没有找到");
        }

    }

}

