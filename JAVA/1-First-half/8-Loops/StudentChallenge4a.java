import java.lang.*;
import java.util.Scanner;

class StudentChallenge4a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int r = 0, N = n, rev = 0;

        String str = "";
        while (n != 0) {
            r = n % 10;
            n = n / 10;
            str = str + r;
        }
        System.out.println(str);

        for (int j = str.length() - 1; j >= 0; j--) {

            switch (str.charAt(j)) {
                case '0':
                    System.out.print(" Zero ");
                    break;
                case '1':
                    System.out.print(" one ");
                    break;
                case '2':
                    System.out.print(" Two ");
                    break;
                case '3':
                    System.out.print(" Three ");
                    break;
                case '4':
                    System.out.print(" four ");
                    break;
                case '5':
                    System.out.print(" five ");
                    break;
                case '6':
                    System.out.print(" six ");
                    break;
                case '7':
                    System.out.print(" seven ");
                    break;
                case '8':
                    System.out.print(" eight ");
                    break;
                case '9':
                    System.out.print(" nine ");
                    break;
                default:
                    break;

            }

        }

    }
}