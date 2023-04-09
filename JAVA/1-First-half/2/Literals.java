import java.lang.*;

class Literals {
    public static void main(String[] args) {

        byte b = 4;
        short s = 5;
        int i = 6;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);

        long L1 = 100;
        System.out.println(L1);
        // long L2 = 10000000000000;
        long L2 = 10000000000000L;
        System.out.println(L2);
        // int I = 1000000000000L;
        // will throw error as Long literal is assigned to Int

        // float f = 17.45;
        float f = 17.45F;
        double d = 17.458277278d;
        System.out.println(f);
        System.out.println(d);

        System.out.println("Printing 10 from different number system");
        Byte b1 = 10;
        Byte b2 = 0b1010;
        Byte b3 = 012;
        Byte b4 = 0XA;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

    }
}

// 999_999_999 =999999999
// 999.999 != 999_.999;
// 999.999 != 999._999;
