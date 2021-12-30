package text2;

/**
 * 多重循环
 *
 * @author cuihaoran
 * @date 2020/5/19-9:59
 */
public class calss4_3 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
