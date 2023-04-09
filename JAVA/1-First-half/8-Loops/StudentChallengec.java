import java.lang.*;

import javax.lang.model.util.ElementScanner14;

class StudentChallengec {

    public static void main(String[] args) {
        // Format-1
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i - 1; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= 5 - i + 1; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (j >= i)
        // System.out.print("* ");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // Format-2
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i + j <= 5)
        // System.out.print(" ");
        // else
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Pattern-3
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i + j <= 5)
        // System.out.print(" ");
        // else
        // System.out.print("*");
        // }
        // for (int k = 1; k <= 4; k++) {
        // if (k >= i)
        // System.out.print(" ");
        // else
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Pattern-4

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j <= 5)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            for (int k = 1; k <= 4; k++) {
                if (k >= i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j > i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            for (int k = 1; k <= 5; k++) {
                if (i + k <= 4)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

    }
}

// Pattern-1
// 1 2 3 4 5
// * * * * *
// _ * * * *
// _ _ * * *
// _ _ _ * *
// _ _ _ _ *

// Pattern-2
// _ _ _ _ *
// _ _ _ * *
// _ _ * * *
// _ * * * *
// * * * * *

// Pattern-3
// 1 2 3 4 5 1 2 3 4 5
// _ _ _ _ * _ _ _ _
// _ _ _ * * * _ _ _
// _ _ * * * * * _ _
// _ * * * * * * * _
// * * * * * * * * *

// Pattern-4
// 1 2 3 4 5 1 2 3 4 5
// _ _ _ _ * _ _ _ _
// _ _ _ * * * _ _ _
// _ _ * * * * * _ _
// _ * * * * * * * _
// * * * * * * * * *
// - * * * * * * * -
// - - * * * * * - -
// - - - * * * - - -
// - - - - * - - - -