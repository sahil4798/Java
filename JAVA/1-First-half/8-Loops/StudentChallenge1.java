import java.lang.*;
import java.util.Scanner;

class StudentChallenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of n number is :" + sum);

        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        System.out.println("Factorial of n is :" + fac);
    }
}