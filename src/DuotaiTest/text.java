package DuotaiTest;


/**
 * 测试类
 *
 * @author cuihaoran
 * @date 2020/5/21-17:21
 */
public class text {
    public static void main(String[] args) {
        double threeArea[] = new double[3];
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("三角形的面积为：" + triangle.area());
        circle circle = new circle(4);
        System.out.println("圆的面积为：" + circle.area());
        juxing juxing = new juxing(3, 4);
        System.out.println("矩形的面积为：" + juxing.area());


    }
}
