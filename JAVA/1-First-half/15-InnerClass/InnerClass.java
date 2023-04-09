import java.lang.*;

class Outer {
    int x;
    Inner i = new Inner(); // Creating Object of innner class inside the Outer-Class-->Valid

    public Outer() {
        x = 1;
    }

    class Inner {
        public int y;

        public Inner() {
            y = 2;
        }

        public void innerDisplay() {
            System.out.println("x  :" + x);
            System.out.println("y  :" + y);
        }

    }

    public void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println("y :" + i.y);

    }
}

class InnerClass {

    public static void main(String[] args) {

        // Outer o = new Outer();
        // o.outerDisplay();

        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();
        System.out.println(i.y);

    }
}