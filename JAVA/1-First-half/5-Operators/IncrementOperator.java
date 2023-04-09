import java.lang.*;

class IncrementOperator {
    public static void main(String[] args) {

        int a = 40;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        int b = 2;
        int c = a + (++b);
        System.out.println(c);

        float f = 137.33F;
        System.out.println(++f);

        char c1 = 72;
        char c3 = ++c1;
        System.out.println(c2);

        byte b1 = 9;
        byte b2 = b++;
        byte b3 = b1 + 1; // Will throw error cause int + byte = int;
        int b4 = b1 + 1;

    }
}

// Increment and Decrement Operator did,t change the type of data type;
// On Boelens you can implemet the Increment and decrement Operator
