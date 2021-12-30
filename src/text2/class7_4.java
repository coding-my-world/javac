package text2;

/**
 * 冒泡排序
 *
 * @author cuihaoran
 * @date 2020/5/21-10:41
 */
public class class7_4 {
    public static void main(String[] args) {
        int[] a = {23, 4, 32, 67, 42, 42, 41, 32, 15};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("从小到大排序后的结果是:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");


    }
}
