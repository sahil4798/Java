import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.PrintStream;

class Student {
    int rollno;
    String name;
    String dept;

}

class PrintStreamDemo {

    public static void main(String[] args) throws Exception {
        // FileOutputStream fos = new FileOutputStream("text.txt");
        // Student st = new Student();
        // st.rollno = 633;
        // st.name = "Ahil Verma";
        // st.dept = "CSE";

        // PrintStream ps = new PrintStream(fos);
        // ps.println(st.rollno);
        // ps.println(st.name);
        // ps.println(st.dept);
        // ps.close();
        // fos.close();

        FileInputStream fis = new FileInputStream("text.txt");
        Student st = new Student();
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr, 50);
        st.rollno = Integer.parseInt(br.readLine());
        st.name = br.readLine();
        st.dept = br.readLine();

        System.out.println("rollno : " + st.rollno);
        System.out.println("name : " + st.name);
        System.out.println("dept : " + st.dept);

    }
}