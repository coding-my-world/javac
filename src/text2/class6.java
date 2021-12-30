package text2;

/**
 * 字符串
 *
 * @author cuihaoran
 * @date 2020/5/19-11:53
 */
public class class6 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "a" + "bc";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s3));
    }
}
