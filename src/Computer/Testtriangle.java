package Computer;

public class Testtriangle {
    public static void main(String[] arg) {
        triangle t1 = new triangle();
        t1.a = 3;
        t1.b = 4;
        t1.c = 5;
        t1.getArea();
        System.out.println(t1.getArea());
    }
}
