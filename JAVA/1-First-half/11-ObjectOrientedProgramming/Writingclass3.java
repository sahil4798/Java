import java.lang.*;

class Cyclinder {
    public double radius;
    public double height;

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

class Writingclass3 {

    public static void main(String[] args) {

        Cyclinder c = new Cyclinder();
        c.radius = 10.5;
        c.height = 20.42;
        System.out.println("lidarea :" + c.lidarea());
        c.surfacearea();
        System.out.println("Volume :" + c.vol());
        System.out.printf("Volume : %2f", c.vol());

    }
}