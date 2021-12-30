package retangle;

/**
 * 矩形
 *
 * @author cuihaoran
 * @date 2020/5/15-10:52
 */
public class retangle extends shape {
    private double width;
    private double height;

    public retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimater() {
        return 2 * width * height;
    }

    @Override
    public String toString() {
        return "retangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
