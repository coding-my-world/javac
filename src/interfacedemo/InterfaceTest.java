package interfacedemo;

/**
 * @author cuihaoran
 * @date 2020/6/12-8:54
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
}
