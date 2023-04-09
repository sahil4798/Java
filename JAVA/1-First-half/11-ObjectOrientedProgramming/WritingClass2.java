import java.lang.*;
import java.nio.channels.AlreadyBoundException;

class Rectangle {
    public int l;
    public int b;

    public int area() {
        return l * b;
    }

    public void perimeter(int x, int y) {
        l = x;
        b = y;
        System.out.println("Perimeter of rectange is :" + 2 * (l + b));
    }

    public boolean issquare() {
        if (l == b)
            return true;
        else
            return false;
    }

}

class WritingClass2 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.l = 10;
        r.b = 10;
        System.out.println(r.area());
        r.perimeter(10, 20);
        System.out.println(r.issquare());

    }
}