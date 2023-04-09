import java.lang.*;
import java.util.Scanner;

class StudentChallenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the value of x");
        // int x = sc.nextInt();
        // if (x % 2 == 0)
        // System.out.println("Even number");

        // else
        // System.out.println("odd number");

        // System.out.println("Enter the age of the person ");
        // int age = sc.nextInt();
        // if (age >= 14 && age <= 55)
        // System.out.println("Person is young");
        // else
        // System.out.println("Person is not young");

        int m1, m2, m3;
        System.out.print("Enter the value marks of maths, physic and Chemistry :");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        float avg = (float) (m1 + m2 + m3) / 3;

        // System.out.println(m1 + " " + m2 + " " + m3 + " ");
        System.out.println(avg);
        if (avg <= 100 && avg >= 70)
            System.out.println("Grade is : A");
        else if (avg < 70 && avg >= 60)
            System.out.println("Grade is : B");
        else if (avg < 60 && avg >= 50)
            System.out.println("Grade is : C");
        else if (avg < 50 && avg >= 40)
            System.out.println("Grade is : D");
        else
            System.out.println("You fail");

    }
}