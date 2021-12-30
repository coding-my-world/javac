package text2;

/**
 * 选择结构
 *
 * @author cuihaoran
 * @date 2020/5/19-8:29
 */
public class class3_1 {
    public static void main(String[] args) {
        int score = 88;
        char grade = 0;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        }
        System.out.println("Grade=" + grade);
    }
}
