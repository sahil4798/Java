import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private int rollno;
    private String name;
    private String dept;
    private float avg;
    public static int s = 12;
    public transient int t;

    Student() {

    }

    Student(int r, String n, String d, float a) {
        rollno = r;
        name = n;
        dept = d;
        avg = a;
        s = 200;
        t = 100;
    }

    public String toString() {
        return "Student Details " + "\nroll no : " + rollno + "\nname : " + name + "\ndept : " + dept + "/navg : "
                + avg + "\ns :" + s + "\nt : " + t;
    }

}

class ObjectstreamDemo {

    public static void main(String[] args) throws Exception {

        // FileOutputStream fos = new FileOutputStream("text.txt");
        // ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Student st = new Student(633, "Ahil Verma", "CSE", 92);

        // oos.writeObject(st);
        // fos.close();

        FileInputStream fis = new FileInputStream("text.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Student st = new Student();
        Student st;

        st = (Student) ois.readObject();
        System.out.println(st.toString());
        ois.close();
        fis.close();

    }
}

// Three Points for useing ObjectStream are :
// 1- Implement Serializable class in Student Class.
// 2- Must Declare Default Constructor in Student class
// 3- if you want not not Serialise some of data or variable make them static or
// transient then they will never be writable and readable in File.