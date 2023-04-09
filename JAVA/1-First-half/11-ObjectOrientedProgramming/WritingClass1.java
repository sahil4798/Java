import java.lang.*;
import java.math.*;

class Circle {
    public double radius;

    public void area() {

        System.out.println(Math.PI * radius * radius);
    }

    public void perimeter() {
        System.out.println(Math.PI * 2 * radius);
    }

    public void Circumference(int r) {

        System.out.println(Math.PI * 2 * r);
    }
}

class WritingClass1 {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 100;
        c.area();
        c.perimeter();
        c.Circumference(1000);

    }
}