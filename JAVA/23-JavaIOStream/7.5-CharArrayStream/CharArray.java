import java.io.CharArrayReader;
import java.io.CharArrayWriter;

class CharArray {

    public static void main(String[] args) throws Exception {
        // char c[] = { 'a', 'b', 'c', 'd', 'e' };

        // CharArrayReader car = new CharArrayReader(c);

        // int x;
        // while ((x = car.read()) != -1) {
        // System.out.print((char) x);
        // }
        // car.close();

        CharArrayWriter caw = new CharArrayWriter(20);
        caw.write('1');
        caw.write('a');
        caw.write('A');
        caw.write('?');

        // char c1[] = caw.toCharArray();
        // for (char c : c1) {
        // System.out.print(c);
        // }

        System.out.println(caw.toString());
        caw.write("Ahil");
        System.out.println(caw.toString());

    
  

    }
}