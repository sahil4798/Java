import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer implements Serializable {
    String custId;
    String name;
    String phoneNo;

    static int count = 1;

    Customer() {

    }

    Customer(String n, String p) {
        custId = "C" + count++;
        name = n;
        phoneNo = p;
    }

    public String toString() {
        return "Customer Details" + "\ncustId : " + custId + "\nname : " + name + "\nphoneNo : " + phoneNo;
    }

}

class StoreCustomer {

    // public static void main(String[] args) throws Exception {

    // Customer c[] = { new Customer("Aahil", "9089"), new Customer("Baka",
    // "8999"), new Customer("Kawai", "8829"),
    // new Customer("senju", "9000")
    // };

    // FileOutputStream fos = new FileOutputStream("file.txt");
    // ObjectOutputStream oos = new ObjectOutputStream(fos);

    // oos.writeInt(c.length);

    // for (Customer x : c)
    // oos.writeObject(x);

    // oos.close();
    // fos.close();

    // }

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("file.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();
        Customer c[] = new Customer[length];

        for (int i = 0; i < length; i++) {
            c[i] = (Customer) ois.readObject();
            System.out.println(c[i].toString());

        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Custumer :");
        String name = sc.nextLine();

        for (int i = 0; i < length; i++) {
            if (name.equalsIgnoreCase(c[i].name)) {
                System.out.println(c[i].toString());

            }
        }

        ois.close();
        fis.close();

    }

}