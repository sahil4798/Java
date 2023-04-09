import java.lang.*;
import java.util.Scanner;

class StudentChallengea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Format-1
        // System.out.print("Enter the value Row and Coloum you want in patter :");
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= c; j++) {
        // System.out.print(" " + j + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // // System.out.format(j + 5 * i + " ");
        // System.out.format("%02d ", j + (5 * i));
        // }
        // System.out.println();
        // }

        // Format-3
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print(i + j + " ");
        // }
        // System.out.println();
        // }

        // Format-4
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                count++;
                // System.out.print(count + " ");
                System.out.format("%02d ", count);
            }
            System.out.println();
        }

    }
}

// Format-1
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5

// Format-2
// 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3 3
// 4 4 4 4 4
// 5 5 5 5 5

// Format-3
// 2 3 4 5 6
// 3 4 5 6 7
// 4 5 6 7 8
// 5 6 7 8 9
// 6 7 8 9 10

// Format-4
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25
