package 实验六;

import java.io.*;

/**
 * @author cuihaoran
 * @date 2020/6/15-16:02
 */
public class Buffer {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("a.txt");
        BufferedInputStream bin = new BufferedInputStream(fin, 1000);
        FileOutputStream fout = new FileOutputStream("b.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout, 1000);
        long before = System.currentTimeMillis();
        int count = 0;
        byte temp[] = new byte[100];
        while (true) {
            try {
                if (!(fin.read(temp) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fout.write(temp);
            } catch (IOException e) {
                e.printStackTrace();
            }
            count++;
        }
        try {
            bin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        fin.close();
        bout.close();
        fout.close();
        System.out.println(System.currentTimeMillis() - before + "ms");
        System.out.println(count);
    }
}
