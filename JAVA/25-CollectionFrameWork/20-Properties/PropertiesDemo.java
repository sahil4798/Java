import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

class PropertiesDemo {

    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        // p.setProperty("Brand", "Apple");
        // p.setProperty("Processor", "M1");
        // p.setProperty("Model", "M1");
        // p.setProperty("color", "Black");
        // System.out.println(p);

        // // p.store(new FileOutputStream("spacks.xml"), "SpacksOfMyPc");
        // p.storeToXML(new FileOutputStream("Spacks.xml"), "My Pc Information");

        p.loadFromXML(new FileInputStream("Person.xml"));
        // p.load(new FileInputStream("spacks.txt"));
        System.out.println(p);
        System.out.println(p.getProperty("Name"));

    }

}