import java.lang.*;
import java.net.http.WebSocket;

class StudentChallenge2 {

    public static void main(String[] args) {

        int n = 100100;
        String str = String.valueOf(n);
        System.out.println(str);
        System.out.println(str.matches("[01]+"));

        // int n2 = 0xFAB12344;
        // String str2 = n2 + "";
        // System.out.println(str2);
        // System.out.println(n2);
        // Problem with printing of HexadecimalNumber

        String str2 = "AB13F279D";
        System.out.println(str2.matches("[A-F0-9]*"));

        String str3 = "13/11/2001";
        System.out.println(str3.matches("[0-9]{2}\\W{1}[0-9]{2}\\W{1}[0-9]{4}"));

    }
}