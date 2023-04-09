import java.util.*;
import java.io.*;

class ResourceDemo {
    static FileInputStream fi;
    static Scanner sc;

    static void meth() throws Exception {
        fi = new FileInputStream("Test.txt");
        sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Division is :" + a / b);
        fi.close();
        sc.close();

    }

    public static void main(String[] args) throws Exception {
        meth();

        // if sc.close() is not enabled
        // int x = sc.nextInt();
        // System.out.println(x);
    }
}