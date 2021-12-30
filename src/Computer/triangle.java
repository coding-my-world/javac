package Computer;

public class triangle {
    double a, b, c;

    double getArea() {
        double r1 = (a + b + c) / 2;
        double area = Math.sqrt(r1 * (r1 - a) * (r1 - b) * (r1 - c));
        return area;
    }
}
