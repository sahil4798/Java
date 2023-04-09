import java.lang.*;

class Subject {
    private String subId;
    private String name;
    private double maxMarks;
    private double marksObtain;

    public Subject(String a, String b) {
        subId = a;
        name = b;

    }

    public Subject(String a, String b, double c, double d) {
        subId = a;
        name = b;
        maxMarks = c;
        marksObtain = d;
    }

    public void setmaxMarks(double m) {
        maxMarks = m;
    }

    public void setmarksObtain(double n) {
        marksObtain = n;
    }

    public String getsubId() {
        return subId;
    }

    public String getname() {
        return name;
    }

    public double getmaxMarks() {
        return maxMarks;
    }

    public double getmarksObtain() {
        return marksObtain;
    }

    public String toString() {
        return "\n Subect ID :" + subId + "\n Name :" + name + "\n maxMarks :" + maxMarks + "\n marksObtain :"
                + marksObtain;
    }

}

class ArrayOfObject {

    public static void main(String[] args) {

        Subject s[] = new Subject[3];
        s[0] = new Subject("#201", "OOPs209", 100.00, 99.0);
        s[1] = new Subject("#204", "DSA087", 100.0, 95.0);
        s[2] = new Subject("#209", "Java98", 100.0, 98.9);

        for (Subject a : s)
            System.out.println(a);

    }
}

// class -Student
// rollNo
// name
// dept
// subjects