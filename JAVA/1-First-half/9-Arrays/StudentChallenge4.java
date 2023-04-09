import java.lang.*;

class StudentChallenge4 {

    public static void main(String[] args) {

        int A[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
        // int B[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 }
        // };
        int B[][] = { { 1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 } };
        int C[][] = new int[A.length][A[0].length];

        //// Sum of Two Matrix
        // if (A.length == B.length && A[0].length == B[0].length) {
        // for (int i = 0; i < A.length; i++) {
        // for (int j = 0; j < A[0].length; j++) {
        // // System.out.println(A[i]);
        // C[i][j] = A[i][j] + B[i][j];
        // }
        // }
        // }
        // for (int x[] : C) {
        // for (int y : x) {
        // System.out.print(y + " ");
        // }
        // System.out.println(" ");
        // }

        // //Multlipication of Two Arrays
        // // if ((A.length == B.length && A[0].length == B[0].length) || (A[0].length
        // ==
        // // B.length)) {
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 4; j++) {
        // for (int k = 0; k < 4; k++) {
        // C[i][j] = C[i][j] + A[i][k] * B[k][j];
        // }
        // }
        // }
        // // }

        // for (int x[] : C) {
        // for (int y : x) {
        // System.out.print(y + " ");
        // }
        // System.out.println(" ");
        // }

        String str[] = { "luffy", "zoro", "nami", "ussop", "sanji" };
        java.util.Arrays.sort(str);
        for (String s : str)
            System.out.print(s + " ");
    }
}