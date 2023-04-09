import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarDataProvider;

class Student {
    private String rollNo;

    private static int count = 1;

    private String assignRollNo() {

        String rno = "Univ-" + (Calendar.get(Calendar.YEAR) - 1900) + "-" + count;
        count++;
        return rno;
    }
    // Calendar.get(Calendar.YEAR) - 1900.

    Student() {
        rollNo = assignRollNo();
    }

    public String getRollNo() {
        return rollNo;
    }

}

public class Studeny {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());

    }
}