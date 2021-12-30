package shape;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        this(0, 0, 0);
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calcArea() {
        double area, l = (a + b + c) / 2;
        area = Math.sqrt(l * (l - a) * (l - b) * (l - c));
        return area;
    }

    public double zhouchang() {
        return a + b + c;
    }

    public void print() {
        System.out.println("三角线三条边" + a + "," + b + "," + c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
