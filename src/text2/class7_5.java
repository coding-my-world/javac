package text2;

/**
 * 对角线
 *
 * @author cuihaoran
 * @date 2020/5/21-10:47
 */
public class class7_5 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += a[i][i];
            sum += a[i][2 - i];
        }
        System.out.println(sum);
    }
}
