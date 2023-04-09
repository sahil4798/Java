import java.util.*;

class Student {
    private String enrollNo;
    private String name;
    private String program;
    static int count = 0;

    private String generateEnrollno() {
        count++;
        Date d = new Date();
        return "AMITY-" + d.getTime() + "-" + count;
    }

    public Student(String name, String program) {
        enrollNo = generateEnrollno();
        this.name = name;
        this.program = program;
    }

    public void display() {
        System.out.println("EnrollNo :" + enrollNo + " Name :" + name + " Program :" + program);
    }
}

class StudentChallenge {

    public static void main(String[] args) {
        Student s1 = new Student("Akainum", "Admiral");
        Student s2 = new Student("Aukigi", "Rouge");
        s1.display();
        s2.display();

        // Date d =new Date();
        // system.out.println(d.);

    }
}