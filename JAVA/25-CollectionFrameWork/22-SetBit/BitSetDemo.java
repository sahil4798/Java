import java.util.*;

class BitSetDemo {

    public static void main(String[] args) {
        BitSet bs1 = new BitSet();
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);

        // System.out.println(bs1);
        // System.out.println(bs1.get(10));
        BitSet bs2 = new BitSet();
        bs2.set(1);
        bs2.set(3);
        bs2.set(5);
        bs2.set(7);
        bs2.set(8);

        // bs1.and(bs2);
        // System.out.println(bs1);
        // bs1.or(bs2);
        // System.out.println(bs1);
        // bs1.flip(0, 9);
        // System.out.println(bs1);
    

    }
}