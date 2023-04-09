import java.lang.*;

class wideningNarrowing {
    public static void main(String[] args) {

        byte b = 100;
        short s = 1000;
        int i = 100;
        long l = 100L;
        float f = 100.4F;
        double d = 1231.342D;
        char c = 'F';

        s = b;
        i = s;
        l = i;
        f = i;
        // i = f;
        // l = f;

        d = f;
        // f=d;
        f = l;

        i = c;
        f = c;
        // c = b;
        // b = c;

    }
}
