
////Try With Resources
import java.util.*;
import java.io.*;

class TryWIthResource {

    static void meth() throws Exception {
        try (FileInputStream fi = new FileInputStream("Test.txt"); Scanner sc = new Scanner(fi)) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Division is :" + a / c);
        }

    }

    public static void main(String[] args) throws Exception {
        try {

            meth();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

//// finally keyword
// import java.util.*;
// import java.io.*;

// class TryWIthResource {
// static FileInputStream fi;
// static Scanner sc;

// static void meth() throws Exception {
// try {

// fi = new FileInputStream("Test.txt");
// sc = new Scanner(fi);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();
// System.out.println("Division is :" + a / c);
// } finally {
// fi.close();
// sc.close();
// }

// }

// public static void main(String[] args) throws Exception {
// try {

// meth();
// } catch (Exception e) {
// System.out.println(e);
// }

// // // if sc.close() is not enabled
// // int x = sc.nextInt();
// // System.out.println(x);
// }
// }