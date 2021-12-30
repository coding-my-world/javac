package 实验五;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author cuihaoran
 * @date 2020/6/16-20:42
 */
public class Exception5 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("text.txt");
            boolean b;
            while ((b = fis.read() != -1)) {
                System.out.println(b);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("message:" + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
