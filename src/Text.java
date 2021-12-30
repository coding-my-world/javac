/**
 * @author cuihaoran
 * @date 2020/6/17-14:33
 */
class MyException extends Exception {
    String message;

    MyException(int m) {
        message = "sssssssss";
    }

    public String toString() {
        return message;
    }
}

class Student {
    public void speak(int m) throws MyException {
        if (m > 1000) {
            MyException exception = new MyException(m);
            throw exception;
        }
        System.out.println("sd" + m + "wdd");
    }
}

public class Text {
    public static void main(String[] args) {
        Student a = new Student();
        try {
            a.speak(600);
            a.speak(1200);
        } catch (MyException e) {
            System.out.println(e.toString());
        }
    }
}
