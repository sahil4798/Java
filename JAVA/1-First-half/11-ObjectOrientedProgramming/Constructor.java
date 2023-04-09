import java.lang.*;
import java.nio.channels.AlreadyBoundException;

class Rectangle {
    private int l;
    private int b;

    public Rectangle() {
        l = 1;
        b = 1;
    }

    public Rectangle(int x) {
        l = x;
        b = x;
    }

    public Rectangle(int x, int y) {
        l = x;
        b = y;
    }

    public void Display() {
        System.out.println("l : " + l + " b : " + b);
    }

}

class Constructor {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 10);
        r.Display();

    }
}