package text2;

/**
 * do_while循环
 *
 * @author cuihaoran
 * @date 2020/5/19-9:37
 */
public class text4_2 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        do {

            sum += i;
            i++;
        } while (i < 100);
        System.out.println(sum);
    }
}
