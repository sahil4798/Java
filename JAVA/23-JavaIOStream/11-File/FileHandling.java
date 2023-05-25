import java.io.*;

class FileHandling {

    public static void main(String[] args) throws Exception {

        // File fi = new File("/Users/sahilverma/Desktop/Java/JAVA/11-File/text.txt");
        // System.out.println(fi.isFile());
        // System.out.println(fi.isDirectory());
        // fi.delete();

        // File f = new File("Folder");
        // System.out.println(f.isDirectory());
        // File list[] = f.listFiles();
        // for (File s : list) {
        // System.out.println(s.getName() + " ");
        // System.out.println(s.getPath());
        // }

        File fi = new File("Folder/one.txt");
        // fi.setReadOnly();
        fi.setWritable(true);
        FileOutputStream fos = new FileOutputStream("Folder/one.txt");

    }
}