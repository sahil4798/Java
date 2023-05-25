import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

class ByteArrray {

    public static void main(String[] args) throws Exception {
        byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        // int i;
        // while ((i = bis.read()) != -1) {
        // System.out.print((char) i);
        // }

        // byte by[] = bis.readAllBytes();
        // String str = new String(by);
        // System.out.println(str);

        // System.out.println(bis.markSupported());
        // bis.close();

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('A');
        bos.write('a');
        bos.write('h');
        bos.write('i');
        bos.write('l');
        // byte b2[] = bos.toByteArray();
        // for (byte x : b2) {
        // System.out.print((char) x);
        // }
        bos.writeTo(new FileOutputStream(
                "/Users/sahilverma/Desktop/Java/JAVA/23-JavaIOStream/7-ByteArrayInputStream/text.txt"));

        bos.close();

    }
}