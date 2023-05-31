import java.io.FileInputStream;
import java.util.StringTokenizer;
import java.util.*;

class StringTokenizerDemo {

    public static void main(String[] args) throws Exception {

        // String str = "name=aahil,batch=cse-11,rollno=633,course=cse";
        // StringTokenizer st = new StringTokenizer(str, ",=");

        // String s;
        // while (st.hasMoreTokens()) {
        // s = st.nextToken();
        // System.out.println(s);
        // }

        // FileInputStream fis = new FileInputStream("spacks.txt");

        FileInputStream fis = new FileInputStream("data.txt");

        byte b[] = new byte[fis.available()];
        fis.read(b);
        String s = new String(b);
        String str = s;
        // StringTokenizer st = new StringTokenizer(str, "=");

        StringTokenizer st = new StringTokenizer(str, ",");

        String si;

        ArrayList<Integer> al = new ArrayList<>();

        while (st.hasMoreTokens()) {
            si = st.nextToken();
            // System.out.println(si);

            al.add(Integer.valueOf(si));
        }
        System.out.println(al);

    }
}