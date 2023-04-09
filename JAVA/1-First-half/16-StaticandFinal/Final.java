class Test {
    final float PI = 3.147f;
    static final int x;
    final int y;
    final int z;
    static {
        x = 10;
    }

    public Test() {
        y = 20;
    }

    {
        z = 30;
    }

}

class Super {
    public final void meth1() {
        System.out.println("Hello");
    }

}

class Sub extends Super {

    //// We can't Override a final Method
    // public void meth1() {
    // System.out.println("Hii");
    // }
}

final class Super2 {
    public final void meth1() {
        System.out.println("Hello");
    }
}
//// We can't Extends a final Class
// class Sub2 extends Super2 {
// }

class Final {

    public static void main(String[] args) {

        // Test t = new Test();
        // System.out.println(t.PI);
        // System.out.println(t.x);
        // System.out.println(t.y);
        // // System.out.println(t.z); //Error is comming

    }
}