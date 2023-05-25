class Super {
    public void method1() {
        System.out.println("method1 of Super");
    }
}

class Sub extends Super {
    public void method1() {
        System.out.println("method1 of Sub");
    }

    public void method2() {
        System.out.println("method2 of Sub ");
    }
}

class SuperSubDemo {

    public static void main(String[] args) {

        // Sub s = new Sub();
        // s.method1();
        // // s.method2();

        Super s = new Sub();
        s.method1();
        // s.method2(); //error

        // Sub s1 = new Super();

    }
}