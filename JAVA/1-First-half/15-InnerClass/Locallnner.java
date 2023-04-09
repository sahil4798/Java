import java.lang.*;

class Outer {
    public void display() {
        class Inner {
            public void innerDisply() {
                System.out.println("Welcome! inside the Inner class");
            }
        }
        Inner i = new Inner();
        i.innerDisply();
    }
}

class Locallnner {

    public static void main(String[] args) {

        Outer o = new Outer();
        o.display();
    }
}