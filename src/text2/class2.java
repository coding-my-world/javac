package text2;

/**
 * 使用关系运算符和逻辑运算符
 *
 * @author cuihaoran
 * @date 2020/5/18-9:42
 */
public class class2 {
    public static void main(String[] args) {
        int a = 88, b = 33, c = 666;
        int d, e, f;
        d = a + b;
        e = a - b;
        f = c - a;
        if ((d > e && e > f) || e < f) {
            System.out.println("a b c");
        } else
            System.out.println("666");

    }
}
