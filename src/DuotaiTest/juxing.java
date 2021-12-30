package DuotaiTest;

/**
 * 矩形
 *
 * @author cuihaoran
 * @date 2020/5/21-17:19
 */
public class juxing extends Shape {
    private double width, length;

    public juxing(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * width;
    }
}
