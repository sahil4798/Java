import java.lang.*;
import java.util.Scanner;

class StudentChallenge1 {

    static boolean Isprime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int HCF(int a, int b) {

        // while (a != 1 && b != 1) {
        while (a != b) {

            if (a > b)
                a = a - b;
            else
                b = b - a;

        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a Number :");
        // int n = sc.nextInt();
        // System.out.println(Isprime(n));

        System.out.print("Enter two Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(HCF(a, b));
    }
}