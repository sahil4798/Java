import java.lang.*;

class Parent {
    public int n;

    public Parent() {
        n = 0;
        System.out.println("Parent non-para-Constructor");
    }

    public Parent(int x) {
        n = x;
        System.out.println("Parent para-Constructor");
    }
}

class Child extends Parent {
    public int m;

    public Child() {
        m = 0;
        System.out.println("Child non-para-Constructor");
    }

    public Child(int y) {
        m = y;
        System.out.println("Child para-Constructor");
    }

    public Child(int x, int y) {
        super(x);
        m = y;
        System.out.println("Child para-Constructor");
    }
}

class ParameterisedConstructor {

    public static void main(String[] args) {

        // Child c1 = new Child();
        // Child c2 = new Child(10);
        Child c3 = new Child(20, 10);

    }
}