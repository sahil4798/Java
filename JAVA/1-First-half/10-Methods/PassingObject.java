import java.lang.*;

class PassingObject {

    static void change(int X[], int index, int val) {
        X[index] = val;
    }

    static void change2(int x, int val) {
        x = val;
    }

    public static void main(String[] args) {
        int A[] = { 2, 4, 6, 8, 10 };
        change(A, 3, 80);
        for (int x : A) {
            System.out.print(x + ",");
        }

        int a = 10;
        change2(a, 20);
        System.out.println("");
        System.out.println(a);
    }
}