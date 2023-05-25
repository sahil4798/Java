import java.io.FileInputStream;

class Stream {

    public static void main(String[] args) throws Exception {

        FileInputStream f = new FileInputStream("text.txt");

        // byte b[] = new byte[f.available()];
        // f.read(b);
        // String s = new String(b);
        // System.out.println(s);

        int b;
        while ((b = f.read()) != -1) {
            System.out.print((char) b);
        }

        f.close();

    }
}
