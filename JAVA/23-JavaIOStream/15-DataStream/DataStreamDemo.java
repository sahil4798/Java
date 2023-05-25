import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Student {
    int rollno;
    String name;
    String dept;
}

class DataStreamDemo {

    public static void main(String[] args) throws Exception {

        // FileOutputStream fos = new FileOutputStream("text.txt");
        // Student st = new Student();
        // st.rollno = 633;
        // st.name = "Ahil Verma";
        // st.dept = "CSE";

        // DataOutputStream dis = new DataOutputStream(fos);

        // dis.writeInt(st.rollno);
        // dis.writeUTF(st.name);
        // dis.writeUTF(st.dept);
        // dis.close();
        // fos.close();

        FileInputStream fis = new FileInputStream("text.txt");
        DataInputStream dis = new DataInputStream(fis);
        Student st = new Student();
        st.rollno = dis.readInt();
        st.name = dis.readUTF();
        st.dept = dis.readUTF();

        System.out.println("rollno : " + st.rollno);
        System.out.println("name : " + st.name);
        System.out.println("dept : " + st.dept);
        dis.close();
        fis.close();

    }
}