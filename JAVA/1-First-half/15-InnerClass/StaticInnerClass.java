import java.lang.*;

class Outer {
    int x = 10;
    static int y = 20;

    static class my {
        public void show() {
            // System.out.println(x); //Invalid
            System.out.println(y);
        }
    }
}

class StaticInnerClass {

    public static void main(String[] args) {

        Outer.my m = new Outer.my();
        m.show();

    }
}