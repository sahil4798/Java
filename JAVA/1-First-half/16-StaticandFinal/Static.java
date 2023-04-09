class Test {

    static int x = 10;
    int y = 20;

    void display() {
        System.out.println(x + " " + y);
    }

    static void display2() {
        System.out.println(x);

    }

}

class Static {

    public static void main(String[] args) {

        // Test t1 = new Test();
        // Test t2 = new Test();
        // t1.display();
        // t1.x = 100;
        // t1.y = 500;
        // t2.display();
        System.out.println(Test.x);

    }
}