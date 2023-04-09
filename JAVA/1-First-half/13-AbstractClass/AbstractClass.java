
abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }

    public void meth1() {
        System.out.println("Super Meth-1");
    }

    public abstract void meth2();
}

class Sub extends Super {
    // public Sub() {
    // System.out.println("Sub Constructor");
    // }

    public void meth2() {
        System.out.println("Sub - Meth-2");
    }
}

class AbstractClass {

    public static void main(String[] args) {
        // Super su = new Super(); //Invalid
        // Super su ; //Valid
        Super su = new Sub();
        su.meth1();
        su.meth2();
    }
}
