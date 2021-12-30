package jicheng;

public class Retangle {
    double length;
    double width;

    Retangle() {
        length = 5;
        width = 3;
    }

    Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        double area = length * width;
        return area;
    }

    double getc() {
        double c = 2 * (length + width);
        return c;
    }


    public String toString() {
        return "Area=" + getArea() + ",c=" + getc();
    }
}

