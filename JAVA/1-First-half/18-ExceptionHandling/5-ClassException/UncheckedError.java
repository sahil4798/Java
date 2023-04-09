class UncheckedError {
    static void fun1() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
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