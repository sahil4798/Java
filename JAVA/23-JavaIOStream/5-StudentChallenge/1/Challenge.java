import java.io.FileInputStream;
import java.io.FileOutputStream;

class Challenge {

    public static void main(String[] args) {

        try {
            FileOutputStream fo = new FileOutputStream("target.txt");
            FileInputStream fi = new FileInputStream("source.txt");

            int i;
            while ((i = fi.read()) != -1) {
                if (i >= 65 && i <= 90)
                    fo.write(i + 32);
                else
                    fo.write(i);
            }

            fo.close();
            fi.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}