import java.io.*;;

class CheckedError {
    static void fun1() {
        FileInputStream fi = new FileInputStream("My.txt");
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun1();
    }

    public static void main(String[] args) {
        fun3();

    }
}