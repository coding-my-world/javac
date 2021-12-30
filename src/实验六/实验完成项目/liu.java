package 实验六.实验完成项目;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author cuihaoran
 * @date 2020/6/16-7:34
 */
public class liu {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        File f = new File(name);
        FileInputStream fileInputStream = new FileInputStream(name);
        byte[] input = new byte[100];
        fileInputStream.read(input);

        String str = new String(input, "UTF-8");
        int count = 0;
        while (true) {
            try {
                if (!(fileInputStream.read(input) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            count++;
        }

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dt = sf.format(System.currentTimeMillis());

        System.out.println("文件的内容为：" + str);
        System.out.println("文件的名字为：" + f.getName());
        System.out.println("文件的路径为：" + f.getPath());
        System.out.println("文件的修改时间为：" + dt);
        System.out.println("文件的大小为：" + f.length());
        System.out.println("文件的长度为：" + count);
        System.out.println(f.canRead() ? "文件可读" : "文件不可读");
        System.out.println(f.canWrite() ? "文件可修改" : "文件不可修改");
        fileInputStream.close();
    }
}
