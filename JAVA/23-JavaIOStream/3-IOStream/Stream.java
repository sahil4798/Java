import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Stream {

    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("text.txt");
            String str = "Ahil Uchiya";
            // System.out.println(str.getBytes());
            // f.write(str.getBytes());

            byte b[] = str.getBytes();
            // f.write(b);
            // f.write(b, 3, 8);
            for (byte x : b)
                f.write(x);

            f.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
