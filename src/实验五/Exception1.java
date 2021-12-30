package 实验五;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author cuihaoran
 * @date 2020/6/16-20:04
 */
public class Exception1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("text.txt");
        boolean b;
        while ((b = fis.read() != -1)) {
            System.out.println(b);
        }
        fis.close();
    }
}
