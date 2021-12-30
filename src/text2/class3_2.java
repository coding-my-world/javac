package text2;

/**
 * switch
 *
 * @author cuihaoran
 * @date 2020/5/19-8:38
 */
public class class3_2 {
    public static void main(String[] args) {
        int month = 8;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31day");
                break;

            case 2:
                System.out.println("28 or 29days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30days");
                break;
        }
    }
}
