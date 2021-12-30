package jicheng;

public class Square extends Retangle {
    Square() {
        length = 6;
        width = 6;
    }

    @Override
    double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    double getc() {
        double c = 4 * length;
        return c;
    }

    public String toString() {
        return "Area=" + getArea() + ",c=" + getc();
    }
}
