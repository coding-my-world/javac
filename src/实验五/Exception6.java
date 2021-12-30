package 实验五;

/**
 * @author cuihaoran
 * @date 2020/6/17-7:44
 */
class MyoneException extends Exception {

}

public class Exception6 {
    public static void main(String[] args) {
        System.out.println("Entering first try block");
        try {
            System.out.println("Entering second try block");
            try {
                throw new MyoneException();
            } finally {
                System.out.println("finally in 2nd try block");
            }
        } catch (MyoneException e) {
            System.out.println("Caught MyoneException in 1st try block");
        } finally {
            System.out.println("finally in 1 st try block");
        }
    }
}
