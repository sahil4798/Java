interface Test {

    int X = 10;

    // private void meth1(); //invalid
    public abstract void meth1();

    void meth2();

    static void meth3() {
        System.out.println("Test meth-3(static)");
    }

    default void meth4() {
        System.out.println("Test meth-4(default)");
        meth5();
    }

    private void meth5() {
        System.out.println("Test meth-5(private)");
    }

}

interface Test2 extends Test {
    void meth6();
}

class My implements Test, Test2 {
    public void meth1() {
    }

    public void meth2() {
    }

    public void meth6() {
    }
}

class IterfaceClassRules {

    public static void main(String[] args) {

        System.out.println(Test.X); // Calling variable of Interface Class
        Test.meth3(); // Calling Static method of Test-Interface Class
        My m = new My();
        m.meth4(); // Calling default method of Test-Interface Class

    }
}