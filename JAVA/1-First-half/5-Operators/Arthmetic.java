import java.lang.*;

class Arthmetic {
    public static void main(String[] args) {

        float a = 12.7f, b = 3.1f;

        float c = a % b;
        float d = a / b;
        System.out.println(c);
        System.out.println(d);

        short a1 = 12;
        int a2 = 13;
        // short a3 = a1 + a2;
        int a3 = a1 + a2;
        System.out.println(a3);

        long b1 = 100000000000L;
        float b2 = 343.33F;
        float b3 = b1 + b2;
        System.out.println(b3);

        // char c1 = 'F';
        char c1 = 70;
        int c2 = 20;
        int c3 = c1 + c2;

        System.out.println(c1);
        System.out.println(c3);

    }
}
