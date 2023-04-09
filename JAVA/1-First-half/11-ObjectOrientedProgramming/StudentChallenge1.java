import java.lang.*;

class Cyclinder {
    private double radius;
    private double height;

    public Cyclinder() {
        radius = 10;
        height = 10;
    }

    public Cyclinder(double x) {
        radius = x;
        height = 1;
    }

    public Cyclinder(double x, double y) {
        radius = x;
        height = y;
    }

    public void setRadius(double x) {
        if (x > 0)
            radius = x;
        else
            radius = 0;
    }

    public void setHeight(double x) {
        if (x > 0)
            height = x;
        else
            height = 0;
    }

    public void setDimensions(double x, double y) {
        if (x > 0)
            radius = x;
        else
            radius = 0;
        if (y > 0)
            height = y;
        else
            height = 0;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double lidarea() {
        return Math.PI * radius * radius;
    }

    public void surfacearea() {
        System.out.println(2 * lidarea() + 2 * Math.PI * radius * height);
    }

    public double vol() {
        return Math.PI * radius * radius * height;
    }
}

public class StudentChallenge1 {

    public static void main(String[] args) {

        Cyclinder c = new Cyclinder(10.3);
        System.out.println("radius :" + c.getRadius());
        System.out.println("height :" + c.getHeight());

    }
}
