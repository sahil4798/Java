import java.lang.*;
import java.nio.channels.AlreadyBoundException;

class Rectangle {
    private int l;
    private int b;

    public void setdata(int x, int y) {
        l = x;
        b = y;
    }

    public void setlenth(int x) {
        if (l > 0)
            l = x;
        else
            l = 0;
    }

    public void setbreadth(int y) {
        if (l > 0)
            b = y;
        else
            b = 0;
    }

    public int getlenth() {
        return l;
    }

    public int getbreadth() {
        return b;
    }

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

public class DataHiding {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setdata(10, 20);
        System.out.println(r.area());
        r.perimeter(10, 20);
        System.out.println(r.issquare());

    }
}
