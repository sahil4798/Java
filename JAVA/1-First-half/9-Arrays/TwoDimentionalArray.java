import java.lang.*;

class TwoDimentionalArray {

    public static void main(String[] args) {
        int B[][] = new int[4][3];

        int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

        // int C[][];
        // C = new int[4][3];
        // int[] D[]; // D is 2-D
        // int[] E, F[]; // E is 1-D and F is 2-D

        // for (int i = 0; i < A.length; i++) {
        // for (int j = 0; j < A[0].length; j++) {
        // System.out.print(A[i][j] + " ");
        // }
        // System.out.println(" ");
        // }

        // for (int x[] : A) {
        // for (int y : x) {
        // System.out.print(y + " ");
        // }
        // System.out.println(" ");
        // }

        int K[][];
        K = new int[3][];
        K[0] = new int[4];
        K[1] = new int[5];
        K[2] = new int[2];

        // for (int i = 0; i < K.length; i++) {
        // for (int j = 0; j < K[i].length; j++) {
        // System.out.print(K[i][j] + " ");
        // }
        // System.out.println(" ");

        // }
        for (int x[] : K) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println(" ");

        }

    }
}