import java.lang.*;
// package stringpractise;

public class StringObject {

    public static void main(String[] args) {

        String str1 = "Java World";
        System.out.println(str1);

        String str2 = new String("Java  UpSideDown");
        System.out.println(str2);

        char c[] = { 'V', 'S', 'C', 'o', 'd', 'e' };
        String str3 = new String(c);
        String str4 = new String(c, 2, 2);
        System.out.println(str3);
        System.out.println(str4);

        byte b[] = { 65, 66, 67, 68, 69, 70 };
        String str5 = new String(b);
        String str6 = new String(b, 3, 2);
        System.out.println(str5);
        System.out.println(str6);

        // Concept of the Pool memory anf Heap

        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String s4 = new String("Java");
        System.out.println(s1 == s4);

    }
}