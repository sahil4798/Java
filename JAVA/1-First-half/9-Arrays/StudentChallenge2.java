import java.lang.*;
import java.util.Scanner;

class StudentChallenge2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int A[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        // // Shifting Element left by one
        // int t = A[0];
        // for (int i = 0; i < A.length - 1; i++) {
        // A[i] = A[i + 1];
        // }
        // A[A.length - 1] = t;
        // for (int i = 0; i < A.length; i++) {
        // System.out.print(A[i] + " ");
        // }

        // // Shifting Element right by one
        // int t = A[A.length - 1];
        // for (int i = A.length - 1; i > 0; i--) {
        // A[i] = A[i - 1];
        // }
        // A[0] = t;

        // for (int x : A) {
        // System.out.print(x + ",");
        // }

        // Inserting An Elemnet
        int A[] = new int[10];
        A[0] = 2;
        A[1] = 4;
        A[2] = 6;
        A[3] = 8;
        A[4] = 10;
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ",");
        }

        // System.out.println(" ");
        // System.out.print("Enter a Element and position you want to insert :");
        // int e = sc.nextInt();
        // int p = sc.nextInt();

        // for (int i = n; i >= p; i--) {
        // A[i] = A[i - 1];
        // }
        // A[p - 1] = e;
        // for (int i = 0; i <= n; i++) {
        // System.out.print(A[i] + ",");
        // }

        // Deleting An Element fron Array
        System.out.println(" ");
        System.out.print("Enter a position you want to Delete :");
        int p = sc.nextInt();

        int t = A[p - 1];

        for (int i = p - 1; i < n; i++) {
            A[i] = A[i + 1];
        }

        for (int i = 0; i < n - 1; i++)
            System.out.print(A[i] + ",");

    }
}