import java.lang.*;
import java.util.Scanner;

class StudentChallenge3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Checking Number Format and finding radix of a number taken in String
        // System.out.println("Enter the Number :");
        // String str = sc.next();
        // // System.out.println(str);
        // if (str.matches("[01]+"))
        // System.out.println("Enterded String is in Binary-number format and Radix =
        // 2");
        // else if (str.matches("[0-7]+"))
        // System.out.println("Enterded String is in Octa-number format and Radix = 4");
        // else if (str.matches("[0-9]+"))
        // System.out.println("Enterded String is in Decimal-number format and Radix =
        // 10");
        // else if (str.matches("[0-9A-F]+"))
        // System.out.println("Enterded String is in Hexa-Decimal number format and
        // Radix = 16");
        // else
        // System.out.println("Entered number is Invalid");

        // Checking Whether given year is leap year or not

        System.out.print("Enter a year  :");
        int y = sc.nextInt();
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not Leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("not a leap Year");
        }
    }

}