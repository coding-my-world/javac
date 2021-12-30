package interfacedemo;

/**
 * @author cuihaoran
 * @date 2020/6/12-8:52
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double computeArea() {
        return width * height;
    }

    @Override
    public double computePerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "Rectangle:width=" + width + ",height," + height + ",area" + computeArea() + "Perimeter" + computePerimeter();
    }
}
