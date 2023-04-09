import java.lang.*;

class Rectangle {
    private int length;
    private int breadth;
    int x = 20;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    private double height;
    int x = 10;

    public Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    public void display() {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }

}

class ThisSuper {

    public static void main(String[] args) {

        Cuboid c = new Cuboid(10, 20, 5);
        c.display();
    }
}
