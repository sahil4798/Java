interface Test {
    void meth1();

    void meth2();
}

class MyTest implements Test {
    public void meth1() {
        System.out.println("MyTest Meth1");
    }

    public void meth2() {
        System.out.println("MyTest Meth2");
    }

    public void meth3() {
        System.out.println("MyTest Meth3");
    }
}

class Interfaces {

    public static void main(String[] args) {

        // Test t = new Test();//invalid
        // Test t; // invalid
        Test t = new MyTest();
        t.meth1();
        t.meth2();
        // t.meth3();
    }
}
