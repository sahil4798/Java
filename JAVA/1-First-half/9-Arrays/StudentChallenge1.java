import java.lang.*;
import java.util.Scanner;

class StudentChallenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = { 2, 4, 3, 7, 9, 15, 10, 1, 5, 12 };
        int i = 0;

        // // Sum of All Elements of an Array
        // int sum = 0;
        // for (i = 0; i < A.length; i++) {
        // sum = sum + A[i];
        // }
        // System.out.println("The sum of all element of Array is : " + sum);

        // //Searching for an element in array
        // System.out.print("Enter element to find :");
        // int key = sc.nextInt();
        // for (i = 0; i < A.length; i++) {
        // if (A[i] == key) {
        // System.out.println("Element is present on index : " + i);
        // System.exit(0);
        // }
        // }
        // if (i == A.length) {
        // System.out.println("Element is not present");
        // }

        // // Finding Largest Element of Array
        // int max = A[0];
        // for (i = 0; i < A.length; i++) {
        // if (A[i] > max) {
        // max = A[i];
        // }
        // }
        // System.out.println("Maximum number in Array is : " + max);

        // Finding Second Largest Element of an Array
        int m1 = A[0], m2 = A[0];
        for (i = 0; i < A.length; i++) {
            if (A[i] > m1) {
                m2 = m1;
                m1 = A[i];
            } else if (A[i] > m2) {
                m2 = A[i];
            }
        }

        System.out.println("The Second Largest Element is : " + m2);

    }
}
