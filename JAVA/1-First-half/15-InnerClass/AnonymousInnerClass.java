import java.lang.*;

// abstract class Temp {
//     public abstract void show();
// }
interface Temp {
    void show();
}

class Outer {
    public void display() {
        // Temp t = new Temp() {
        // public void show() {
        // System.out.println("Welcome! to Anonymous Class");
        // }
        // };
        // t.show();

        new Temp() {
            public void show() {
                System.out.println("Welcome! to Anonymous Class");
            }
        }.show();
    }
}

class AnonymousInnerClass {

    public static void main(String[] args) {

        Outer o = new Outer();
        o.display();

    }
}