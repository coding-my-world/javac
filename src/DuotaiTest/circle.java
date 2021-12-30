package DuotaiTest;

/**
 * 圆
 *
 * @author cuihaoran
 * @date 2020/5/21-17:13
 */
public class circle extends Shape {
    private double r;

    public circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        double area = 3.14 * r * r;
        return area;
    }
}
