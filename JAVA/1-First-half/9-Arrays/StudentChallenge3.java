import java.lang.*;
import java.util.Scanner;

class StudentChallenge3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int A[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        // // Coping an Array
        // int B[] = new int[A.length];
        // for (int i = 0; i < A.length; i++) {
        // B[i] = A[i];
        // }
        // for (int x : B) {
        // System.out.print(x + ",");
        // }

        // //Reversing An Array
        // int B[] = new int[A.length];
        // for (int i = 0, j = A.length - 1; i < A.length; i++, j--) {
        // B[j] = A[i];
        // }
        // for (int x : B) {
        // System.out.print(x + ",");
        // }

        // Incresing Size of Array
        int A[] = { 1, 2, 3, 4, 5 };
        int B[] = new int[A.length * 2];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        A = B;
        B = null;
        System.out.println(A.length);
        for (int x : A) {
            System.out.print(x + ",");
        }

    }
}