import java.lang.*;
import java.util.Scanner;
import java.math.*;

class StudentChallenge5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter First Term ,Common Difference and Number of terms
        // :");
        // int a = sc.nextInt();
        // int d = sc.nextInt();
        // int n = sc.nextInt();
        // int t = 0;

        // for (int i = 0; i < n; i++) {
        // t = a + i * d;
        // System.out.print(t + ",");
        // }

        // System.out.print("Enter First Term ,Common ratio and Number of terms :");
        // int a = sc.nextInt();
        // int r = sc.nextInt();
        // int n = sc.nextInt();
        // int t = a;

        // for (int i = 1; i <= n; i++) {
        // System.out.print(t + ",");
        // t = t * r;
        // // t = (int) Math.pow(a, i);
        // }

        System.out.print("Enter the Number of terms : ̃");
        int n = sc.nextInt();
        int t1 = 0, t2 = 1, t = 0;
        System.out.print(t1 + "," + t2 + ",");
        for (int i = 0; i < n - 2; i++) {
            t = t1 + t2;
            t1 = t2;
            t2 = t;
            System.out.print(t + " ");
        }

    }
}