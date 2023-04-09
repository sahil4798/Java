import java.lang.*;

class StudentChallenge3 {

    static int max(int... A) {
        if (A.length == 0)
            return Integer.MIN_VALUE;

        int m = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > m)
                m = A[i];
        }
        return m;
    }

    static int sum(int... A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        return sum;
    }

    static float discount(float... A) {
        float sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        if (sum >= 30000)
            return 0.3f * sum;
        if (sum >= 20000)
            return 0.2f * sum;
        if (sum >= 15000)
            return 0.15f * sum;
        if (sum >= 10000)
            return 0.1f * sum;

        return 0;
    }

    // static float discount(int d, float... A) {
    // float sum = 0;
    // for (int i = 0; i < A.length; i++) {
    // sum = sum + A[i];
    // }x

    // return (d / 100) * sum;
    // }

    public static void main(String[] args) {

        // System.out.println(max());
        // System.out.println(max(34));
        // System.out.println(max(2, 4, 1, 3, 9, 10, 54, 11, 9, 98, 50));

        // System.out.println(sum());
        // System.out.println(sum(10, 20, 30));

        // System.out.println(discount());
        // System.out.println(discount(1000, 2000, 10000));

        System.out.println(discount(1000, 2000, 10000));

    }
}