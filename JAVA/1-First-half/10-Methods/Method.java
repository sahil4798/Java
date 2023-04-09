// import java.lang.*;

// class Method {
// int max(int x, int y) {
// if (x > y)
// return x;
// else
// return y;
// }

// public static void main(String[] args) {

// int a = 10, b = 5;
// Method m = new Method();
// System.out.println(m.max(a, b));
// }
// }

import java.lang.*;

class Method {
    static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    static int inc(int x) {
        x++;
        System.out.println(x);
        return x;
    }

    public static void main(String[] args) {

        int a = 10, b = 5;
        System.out.println(max(a, b));
        inc(a);
        System.out.println(a);
    }
}