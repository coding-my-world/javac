package text1;

public class math1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
