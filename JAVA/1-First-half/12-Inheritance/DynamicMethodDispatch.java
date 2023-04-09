import java.lang.*;

class Super {

    public void method1() {
        System.out.println("Super-Method-1");
    }

    public void method2() {
        System.out.println("Super-Method-2");
    }

}

class Sub extends Super {
    public void method2() {
        System.out.println("Sub-Method-2");
    }

    public void method3() {
        System.out.println("Sub-Method-3");
    }
}

class DynamicMethodDispatch {

    public static void main(String[] args) {

        // Method Overriding
        // Sub s1 = new Sub();
        // s1.method1();
        // s1.method2();
        // s1.method3();

        // Dynamic Method Dispatch
        Super s2 = new Sub();
        s2.method1();
        s2.method2();
        // s2.method3(); //will throw error
    }
}