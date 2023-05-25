import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

class BufferStream {

    public static void main(String[] args) throws Exception {

        // FileInputStream fis = new FileInputStream("test.txt");
        // BufferedInputStream bis = new BufferedInputStream(fis, 20);
        // System.out.println(fis.markSupported());
        // System.out.println(bis.markSupported());

        FileReader fis = new FileReader("test.txt");
        BufferedReader bis = new BufferedReader(fis, 20);

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        System.out.println(bis.readLine());
    }
}