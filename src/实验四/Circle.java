package 实验四;

/**
 * @author cuihaoran
 * @date 2020/6/2-15:43
 */
public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
}
