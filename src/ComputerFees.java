import java.io.File;
import java.util.Scanner;

public class ComputerFees {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("202102.txt"));
        sc.useDelimiter("[： 元]");

        while (sc.hasNext()) {
            sc.next();
            sc.next();
            String shf = sc.next();
            sc.next();
            String ctf = sc.next();
            sc.next();
            String wlf = sc.next();
            double total = Double.parseDouble(shf) + Double.parseDouble(ctf) + Double.parseDouble(wlf);
            System.out.println("sfd" + total + "fefe");
        }
    }
}
