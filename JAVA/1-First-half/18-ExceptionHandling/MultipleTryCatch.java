class MultipleTryCatch {

    public static void main(String[] args) {

        try {

            int A[] = { 40, 30, 20, 10, 0 };
            int c = A[0] / A[2];
            System.out.println("Division is:" + c);
            System.out.println(A[8]);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }
        System.out.println("Bye-Bye");

    }
}

// ************************Multiple try-catch***************
// try{

// int A[] = { 40, 30, 20, 10, 0 };
// int c = A[0] / A[2];System.out.println("Division is
// :"+c);System.out.println(A[8]);}catch(
// ArithmeticException e){System.out.println("Division by 0");}catch(
// ArrayIndexOutOfBoundsException e){System.out.println("Index is invalid");
// }System.out.println("Bye-Bye");

// ************************Nested try-catch***************
// try {

// int A[] = { 40, 30, 20, 10, 0 };
// int c = A[0] / A[2];
// System.out.println("Division is :" + c);
// try {

// System.out.println(A[8]);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("Index is invalid");
// }
// } catch (ArithmeticException e) {
// System.out.println("Division by 0");
// }
// System.out.println("Bye-Bye");