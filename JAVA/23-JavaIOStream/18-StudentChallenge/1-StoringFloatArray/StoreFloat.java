import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class StoreFloat {

    public static void main(String[] args) throws Exception {

        float f[] = { 1.34f, 67.8f, 9.28f, 27.98f };

        // FileOutputStream fos = new FileOutputStream("text1.txt");
        // DataOutputStream dos = new DataOutputStream(fos);

        // dos.writeInt(f.length);
        // for (float x : f) {
        // dos.writeFloat(x);
        // }
        // dos.close();
        // fos.close();

        FileInputStream fis = new FileInputStream("text1.txt");
        DataInputStream dis = new DataInputStream(fis);

        int count = dis.readInt();
        float f1[] = new float[count];
        for (int i = 0; i < count; i++) {
            f1[i] = dis.readFloat();
        }

        for (float x : f1) {
            System.out.println(x);
        }
        dis.close();
        fis.close();

    }
}