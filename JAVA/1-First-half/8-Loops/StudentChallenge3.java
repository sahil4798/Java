import java.lang.*;
import java.util.Scanner;
import java.math.*;

class StudentChallenge3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Finding Reverse of a Number
        // Verify Given Number is Palindrome or not

        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int r, i = 0, N = n, rev = 0;

        String str = "The revrese of number is :";

        while (n != 0) {
            r = n % 10;
            n = n / (10);
            rev = rev * 10 + r;
        }

        System.out.println(rev);

        if (rev == N) {
            System.out.println(N + " is a Palindrome ");
        } else {
            System.out.println(N + " is not a Palindrome ");
        }

    }
}

// System.out.println(Math.pow(2, 3));