package 实验四;

/**
 * 测试类1
 *
 * @author cuihaoran
 * @date 2020/6/2-15:51
 */
public class Test1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 8);
        System.out.println("rectangle's area=" + rectangle.getArea());
        Circle circle = new Circle(4);
        System.out.println("circle's area=" + circle.getArea());
    }
}
