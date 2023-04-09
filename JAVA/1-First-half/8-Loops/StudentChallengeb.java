import java.lang.*;

class StudentChallengeb {

    public static void main(String[] args) {

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Format-2
        // int count = 0;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // count++;
        // System.out.format("%02d ", count);
        // // System.out.print(count + " ");
        // }
        // System.out.println();
        // }

        // Format-3
        // for (int i = 5; i >= 0; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i + 1; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Format -4
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i + 1; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // format -5
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println();
        }

    }
}

// Format-1
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// Format-2
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// Format -3
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// format-4
// 1 1 1 1 1
// 2 2 2 2
// 3 3 3
// 4 4
// 5

// Format-5
// 01 02 03 04 05
// 06 07 08 09
// 10 11 12
// 13 14
// 15