package text2;

/**
 * 水仙花数
 *
 * @author cuihaoran
 * @date 2020/5/19-12:14
 */
public class class7_1 {
    public static void main(String[] args) {
        int shu;
        for (shu = 100; shu <= 999; shu++) {
            int ge = shu % 10;
            int shi = shu / 10 % 10;
            int bai = shu / 100;
            if (shu == Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3)) {
                System.out.println(shu);
            }
        }
    }
}
