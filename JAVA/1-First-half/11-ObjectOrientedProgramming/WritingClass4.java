import java.lang.*;
import java.util.Scanner;

class Student {
    static int roll;
    static String name;
    static String course;
    static int m1, m2, m3;

    static int total() {
        return m1 + m2 + m3;
    }

    static float avg() {
        return (float) total() / 3;
    }

    static char grade() {
        if (avg() >= 90)
            return 'A';

        if (avg() >= 80)
            return 'B';

        if (avg() >= 70)
            return 'C';

        if (avg() >= 60)
            return 'D';

        return 'E';
    }

    static String detail() {
        return "Roll no :" + roll + "\n" + "Name :" + name + "\n" + "course :" + course;
    }

    // static String toString() {
    // return "Roll no :" + roll + "\n" + "Name :" + name + "\n" + "course :" +
    // course;
    // }

}

class WritingClass4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.roll = sc.nextInt();
        s.name = sc.next();
        s.course = sc.next();
        s.m1 = sc.nextInt();
        s.m2 = sc.nextInt();
        s.m3 = sc.nextInt();

        System.out.println("Details: " + "\n" + s.detail());
        System.out.println("Total: " + s.total());
        System.out.println("Average :" + s.avg());
        System.out.println("Grade :" + s.grade());

        // System.out.println(s);
    }
}

// Input Stream
// 633 sahil CSE-11 100 90 87