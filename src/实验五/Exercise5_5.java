package 实验五;

/**
 * @author cuihaoran
 * @date 2020/6/17-7:55
 */
class MyException extends Exception {
    String b;

    MyException(String str) {
        b = str;
    }

    public String getContent() {
        return b;
    }

}

public class Exercise5_5 {
    public static void check(String str) throws MyException { //指明要抛出的异常
        char a[] = str.toCharArray(); //将字符串转换为字符数组
        int i = a.length;
        for (int k = 0; k < i - 1; k++) { //检查字符数组中的每个元素
            //如果当前元素是英文字母以外的字符
            if (!((a[k] >= 65 && a[k] <= 90) || (a[k] >= 97 && a[k] <= 122))) {
                //抛出 MyException 异常类对象
                throw new MyException("字符串\"" + str + "\"中含有非法字符！");
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "HellWorld";
        String str2 = "Hell!MR!";
        try {
            check(str1); //调用 check()方法
            check(str2); //执行该行代码时，抛出异常
        } catch (MyException e) { //捕获 MyException 异常
            System.out.println(e.getContent()); //输出异常描述信息
        }
    }
}
