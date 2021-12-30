package shape;

/**
 * 测试类
 *
 * @author cuihaoran
 * @date 2020/5/15-9:43
 */
public class test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setA(3);
        triangle.setB(4);
        triangle.setC(5);
        System.out.println(triangle.calcArea());
        System.out.println(triangle.zhouchang());
        System.out.println(triangle.toString());
    }
}
