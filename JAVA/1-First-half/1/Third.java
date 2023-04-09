// public class Third {

// }

import java.lang.*;
import java.util.Scanner;

class Third {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println(a);

        System.out.println("Enter the value of b");
        b = sc.nextInt();
        System.out.println(b);

        c = a + b;
        System.out.println("The sum of Entered number is " + c);

    }
}