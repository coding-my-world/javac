package 实验六.实验完成项目;

import java.io.*;

/**
 * @author cuihaoran
 * @date 2020/6/16-11:52
 */
public class Student {
    public static void main(String[] args) throws Exception {
        InputStreamReader iin = new InputStreamReader(System.in);
        BufferedReader bin = new BufferedReader(iin);
        String str;
        FileWriter fw = new FileWriter("c.txt");
        //创建带缓冲的BufferedWriter类对象bw，并关联到fw1
        BufferedWriter bw = new BufferedWriter(fw);

        //循环读入字符串
        while (true) {
            System.out.println("请输入姓名、学号： ");
            //清空输出缓冲区
            System.out.flush();
            //读入输入的一行
            str = bin.readLine();
            //若遇到空行则break,结束读-写工作
            if (str.length() == 0) break;
            //将本行字符串写出到对象bw
            bw.write(str);
            //在对象bw中创建新行，为下一行输出做准备
            bw.newLine();
            System.out.println("请输入成绩： ");//为了方便提取成绩信息，将其单独作为一行写入文件
            System.out.flush();
            str = bin.readLine();
            if (str.length() == 0) break;
            bw.write(str);
            bw.newLine();
        }
        //关闭输出对象
        bin.close();
        bw.close();
        System.out.println("姓名、学号、成绩已保存到文本");
        ////

        //对student.txt文件的操作
        FileReader fr = new FileReader("c.txt");
        BufferedReader bin1 = new BufferedReader(fr);
        //建立缓冲BufferedReader对象bin1，关联到fr

        String str2;
        str2 = bin1.readLine();
        double temp = 0, ave = 0, min = 1000, sum = 0, max = 0;
        int linenum = 0;//以行数的奇偶判断成绩所在的行
        while (str2 != null) {
            linenum++;
            if (linenum % 2 == 0) {//偶数行为成绩
                temp = Double.parseDouble(str2);
                sum += temp;//求和
                if (min > temp) {
                    min = temp;
                }
                if (max < temp) {
                    max = temp;
                }
            }
            str2 = bin1.readLine();
        }
        ave = sum / (linenum / 2);
        System.out.println("学生成绩的平均值为：" + ave);
        System.out.println("学生成绩的最大值为：" + max);
        System.out.println("学生成绩的最小值为：" + min);
    }

}
