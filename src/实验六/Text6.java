package 实验六;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author cuihaoran
 * @date 2020/6/15-15:17
 */
public class Text6 {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(" b.txt");
        byte input[] = new byte[50];
        try {
            fileInputStream.read(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = new String(input, "UTF-8");
        System.out.println(str);
        fileInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
        byte output[] = str.getBytes("UTF-8");
        fileOutputStream.write(output);
        fileOutputStream.close();

    }
}
