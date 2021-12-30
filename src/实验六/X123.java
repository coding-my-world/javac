package 实验六;

import java.io.File;

/**
 * @author cuihaoranz
 * @date 2020/6/15-14:26
 */
public class X123 {
    //递归方法输出文件夹里的文件
    public static void showFileInfo(File dir) {
        if (dir.isDirectory()) {
            File filelist[] = dir.listFiles();
            for (int i = 0; i < filelist.length; i++) {
                if (filelist[i].isFile()) {
                    System.out.println(filelist[i].getName());
                } else {
                    showFileInfo(filelist[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        File dir = new File("D://dev");
        showFileInfo(dir);
    }
}
