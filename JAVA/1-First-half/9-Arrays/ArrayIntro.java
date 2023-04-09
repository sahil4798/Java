import java.lang.*;

class ArrayIntro {

    public static void main(String[] args) {

        // int A[] = new int[10];
        int B[] = { 1, 2, 3, 4, 5 };
        // int C[];
        // C = new int[10]; // Valid
        // int[] D = new int[10]; // Valid

        for (int i = 0; i < B.length; i++)
            System.out.print(B[i] + " ");
        System.out.println();

        // for each Loop
        // for (int x : B) {
        // System.out.println(x++);
        // }
        for (int x : B) {
            System.out.print(x + " ");
        }

        // System.out.println(B.length);

    }
}