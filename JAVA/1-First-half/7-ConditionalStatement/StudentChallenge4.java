import java.lang.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class StudentChallenge4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Finding day with its date
        // System.out.print("Enter date :");
        // int date = sc.nextInt();
        // if (date == 1) {
        // System.out.println("Monday");
        // } else if (date == 2) {
        // System.out.println("Tuesday");
        // } else if (date == 3) {
        // System.out.println("Wensday");
        // } else if (date == 4) {
        // System.out.println("Thusday");
        // } else if (date == 5) {
        // System.out.println("Friday");
        // } else if (date == 6) {
        // System.out.println("Satarday");
        // } else if (date == 7) {
        // System.out.println("Sunday");
        // } else {
        // System.out.println("Date is Invalid ");
        // }

        // Find Type of Website and protocal used;
        System.out.print("Enter a Website :");
        String str = sc.nextLine();

        String p = str.substring(0, str.indexOf(':'));
        String type = str.substring(str.lastIndexOf('.') + 1, str.length());

        if (p.equals("http")) {
            System.out.println("hhtp");
        } else if (p.equals("ftp")) {
            System.out.println("ftp");
        } else {
            System.out.println("Unknown Protocal");
        }

        if (type.equals("com")) {
            System.out.println("Commerce");
        } else if (type.equals("org")) {
            System.out.println("Organisation");
        } else if (type.equals("gov")) {
            System.out.println("Goverment");
        } else if (type.equals("in")) {
            System.out.println("India");
        } else {
            System.out.println("Unknown Domain");
        }
    }
}

// "http://www.google.com"
