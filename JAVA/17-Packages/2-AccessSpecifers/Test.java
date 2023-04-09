import mypackage1.Demo1;

class Demo4 extends Demo1 {
    public void show() {
        // System.out.println(a);
        // System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        display();
    }

}

class Test {

    public static void main(String[] args) {

        // // **********Non-SubClass and Diff-Package*********
        // Demo1 d1 = new Demo1();
        // // System.out.println(d1.a); //default
        // // System.out.println(d1.b); //public
        // // System.out.println(d1.c); //Protected
        // System.out.println(d1.d);
        // d1.display();

        //// **********Non-SubClass and Diff-Package*********
        Demo4 d4 = new Demo4();
        d4.show();
    }
}