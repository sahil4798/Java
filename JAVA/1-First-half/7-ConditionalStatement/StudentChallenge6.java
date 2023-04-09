import java.lang.*;
import java.util.Scanner;

class StudentChallenge6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Make a Menu Driven Program for Arthmatic Operations

        System.out.print("Enter Two Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Artmetic Opration you want to apply i.e add , sub , mul , div , rem : ");
        String option = sc.nextLine();

        // System.out.println(a + " " + b + " " + option);

        switch (option) {
            case "sum":
                System.out.println(" a + b =" + (a + b));
                break;
            case "sub":
                System.out.println(" a - b =" + (a - b));
                break;
            case "mul":
                System.out.println(" a * b =" + (a * b));
                break;
            case "div":
                System.out.println(" a / b =" + (a / b));
                break;
            case "rem":
                System.out.println(" a % b =" + (a % b));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}

// System.out.print("Enter Two Number and Artmetic Opration you want to apply
// i.e add , sub , mul , div , rem : ");

// int a = sc.nextInt();
// int b = sc.nextInt();
// String option = sc.nextLine();