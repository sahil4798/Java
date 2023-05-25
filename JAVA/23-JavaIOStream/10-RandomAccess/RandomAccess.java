import java.io.RandomAccessFile;

class RandomAccess {

    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("main.txt", "rw");

        System.out.println(raf.getFilePointer());
        raf.writeBytes("ABCDEFGHIJ");

        System.out.println(raf.getFilePointer());
        raf.seek(0);
        int x;
        while ((x = raf.read()) != -1) {
            System.out.print((char) x);
        }
        System.out.println(" ");

        raf.seek(raf.getFilePointer() - 10);
        System.out.println((char) raf.read());

        raf.write('b');
        System.out.println((char) raf.read());
        raf.close();

    }
}