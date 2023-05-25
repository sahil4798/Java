import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

class Challenge {

    public static void main(String[] args) {

        try {
            // FileOutputStream fo = new FileOutputStream("target.txt");
            FileInputStream fi = new FileInputStream("source.txt");
            FileInputStream fi2 = new FileInputStream("target.txt");
            FileOutputStream fo2 = new FileOutputStream("target2.txt");

            SequenceInputStream si = new SequenceInputStream(fi, fi2);

            int x;
            while ((x = si.read()) != -1) {
                fo2.write(x);
            }

            fi2.close();
            fo2.close();
            fi.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}