import java.lang.*;
import java.util.Scanner;

class StudentChallenge2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Printing Reverse of a number
        // Printing sum of all digit in number
        // Total number of digit in number
        // Finding number is an Amstrong Number

        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int r, i = 0, sum = 0, N = n;

        while (n != 0) {
            r = n % 10;
            System.out.println(r);
            n = n / (10);
            i++;
            sum = sum + r * r * r;

        }
        System.out.println("The number of digit in  n :" + i);

        if (sum == N) {
            System.out.println("n is a Amstrong Number");
        } else {
            System.out.println("n is not a Amstrong Number");
        }

    }
}

// System.out.println(a % 10);
// System.out.println(((a % 100) - (a % 10)) / 10);
// System.out.println(((a % 1000) - (a % 100)) / 100);