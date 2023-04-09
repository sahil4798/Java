import java.lang.*;
import java.util.Scanner;

class PractiseSwitchCase7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a Number :");
        // int Number = sc.nextInt();

        // switch (Number) {
        // case 1:
        // System.out.println("One");
        // break;
        // case 2:
        // System.out.println("Two");
        // break;
        // case 3:
        // System.out.println("Three");
        // break;
        // case 4:
        // System.out.println("Four");
        // break;
        // default:
        // System.out.println("Invalid");
        // break;
        // }

        System.out.print("Enter a Number :");
        String str = sc.nextLine();

        switch (str) {
            case "1":
                System.out.println("One");
                break;
            case "2":
                System.out.println("Two");
                break;
            case "3":
                System.out.println("Three");
                break;
            case "4":
                System.out.println("Four");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}