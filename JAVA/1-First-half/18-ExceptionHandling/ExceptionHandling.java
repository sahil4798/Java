class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println("Division is :" + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Bye-Bye");

    }
}