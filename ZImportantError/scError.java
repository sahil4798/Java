import java.lang.*;
import java.util.Scanner;

class scError {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer :");
        int a = sc.nextInt();
        System.out.println(a);

        sc.nextLine();

        System.out.print("Enter a String :");
        String str = sc.nextLine();
        System.out.println(str);
    }
}