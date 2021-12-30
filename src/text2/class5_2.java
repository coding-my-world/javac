package text2;

import java.util.Arrays;

/**
 * 排序
 *
 * @author cuihaoran
 * @date 2020/5/19-11:33
 */
public class class5_2 {
    public static void main(String[] args) {
        int[] shuzu = {34, 567, 32, 45, 567, 887, 666, 875};
        int s = shuzu.length;
        Arrays.sort(shuzu);
        for (int i = 0; i < s; i++)
            System.out.println(shuzu[i]);
    }
}
