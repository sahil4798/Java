import java.io.FileReader;
import java.io.FileWriter;

class File {

    public static void main(String[] args) throws Exception {
        // FileWriter fw = new FileWriter("mine.txt");
        // String str = "I AM Ghost of Uchiya";
        // // char c[] = (char)str;
        // fw.write(str);
        // fw.close();

        FileReader fr = new FileReader("mine.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();

    }
}