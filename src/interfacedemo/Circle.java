package interfacedemo;

/**
 * @author cuihaoran
 * @date 2020/6/12-8:48
 */
public class Circle implements Shape {
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
    public double computeArea() {
        return 3.14 * r * r;
    }

    @Override
    public double computePerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public String toString() {
        return "Circle:r=" + r + ",area=" + computeArea() + "Perimeter=" + computePerimeter();
    }
}
