import java.lang.*;

class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cyclinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}

class inheritance {

    public static void main(String[] args) {

        // Circle c1 = new Circle();
        Cyclinder c2 = new Cyclinder();
        c2.radius = 7;
        c2.height = 10;
        System.out.println(c2.volume());
    }
}