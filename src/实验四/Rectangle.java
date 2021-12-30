package 实验四;

/**
 * @author cuihaoran
 * @date 2020/6/2-15:04
 */
public class Rectangle extends Shape {            //建立矩形类继承Shape类
    private double Width, Height;

    public Rectangle(int width, int height) {
        Width = width;
        this.Height = height;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        this.Height = height;
    }

    @Override
    public double getArea() {
        return Width * Height;
    }
}
