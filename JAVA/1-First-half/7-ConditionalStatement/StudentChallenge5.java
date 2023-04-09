import java.lang.*;
import java.util.Scanner;

class StudentChallenge5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display name of a day based on number
        // System.out.println("Enter a Nuber");
        // int num = sc.nextInt();

        // switch (num) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thusday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Satarday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Invalid number");
        // break;
        // }

        // Display name of a month based on number

        // System.out.print("Enter a number :");
        // int N = sc.nextInt();

        // switch (N) {
        // case 1:
        // System.out.println("Jan");
        // break;
        // case 2:
        // System.out.println("Feb");
        // break;
        // case 3:
        // System.out.println("Mar");
        // break;
        // case 4:
        // System.out.println("April");
        // break;
        // case 5:
        // System.out.println("May");
        // break;
        // case 6:
        // System.out.println("June");
        // break;
        // case 7:
        // System.out.println("July");
        // break;
        // case 8:
        // System.out.println("Aug");
        // break;
        // case 9:
        // System.out.println("Sep");
        // break;
        // case 10:
        // System.out.println("Oct");
        // break;
        // case 11:
        // System.out.println("Nov");
        // break;
        // case 12:
        // System.out.println("Dec");
        // break;
        // default:
        // System.out.println("Invalid Number");

        // }

        // Display Type of Website;

        System.out.print("Enter a String :");
        String web = sc.nextLine();
        int pos = web.lastIndexOf('.');
        String type = web.substring(web.lastIndexOf('.') + 1, web.length());
        // System.out.println(type);

        switch (type) {
            case "com":
                System.out.println("Commersial");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case "gov":
                System.out.println("Goverment");
                break;
            case "in":
                System.out.println("India");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

    }
}

// "http://www.google.com"