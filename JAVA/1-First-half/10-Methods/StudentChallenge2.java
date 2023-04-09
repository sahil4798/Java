import java.lang.*;
import java.math.*;
import java.util.function.DoublePredicate;

public class StudentChallenge2 {

    // static double area(double a, double b) {
    // return a * b;
    // }
    // static double area(double a) {
    // return Math.PI * a * a;

    // }

    static int reverse(int n) {
        int r = 0, R = 0;
        while (n != 0) {
            r = n % 10;
            n = n / 10;
            R = R * 10 + r;

        }
        return R;

    }

    static int[] reverse(int A[]) {
        int B[] = new int[A.length];
        for (int i = 0, j = A.length - 1; i < A.length; i++, j--) {
            B[j] = A[i];
        }
        return B;
    }

    static boolean validate(String str) {
        if (str.matches("[a-z]+"))
            return true;
        else
            return false;
    }

    static boolean validate(int a) {
        if (a > 20 && a < 25)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        // // area-Method Overloading
        // System.out.println(area(10.5d, 100.0d));
        // System.out.println(area(10.54d));

        // // Reverse-Method Overloading
        // int n = 273;
        // int N[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // System.out.println(reverse(n));
        // for (int x : reverse(N)) {
        // System.out.print(x + ",");
        // }

        // overload method to Validate name and age
        String str = "sahil";
        int age = 22;
        System.out.println(validate(str));
        System.out.println(validate(age));

    }
}