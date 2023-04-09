import java.lang.*;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public double area() {
        return length * breadth;
    }
}

class Cuboid extends Rectangle {
    private double height;

    public Cuboid() {
        height = 1;
    }

    public Cuboid(int h) {
        height = h;
    }

    public Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    public double volume() {
        return area() * height;
    }
}

public class PractiseConstructors {

    public static void main(String[] args) {

        // Cuboid c = new Cuboid();
        // System.out.println(c.volume());

        // Cuboid c = new Cuboid(5);
        // System.out.println(c.volume());

        Cuboid c = new Cuboid(20, 10, 5);
        System.out.println(c.volume());

    }
}