import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Account implements Serializable {
    String accountnumber;
    String name;
    long balance;

    Account() {
    }

    public Account(String accountnumber, String name, long balance) {
        this.accountnumber = accountnumber;
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        return "****************Account details************* " + "\nAccountNumber :" + this.accountnumber + "\n Name :"
                + this.name + "\nBalance :"
                + this.balance;

    }

}

class StudentChallenge {

    public static void main(String[] args) throws Exception {

        HashMap<String, Account> hm = new HashMap<>();
        Account a = null;

        try {
            FileInputStream fis = new FileInputStream("Account.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                a = (Account) ois.readObject();
                System.out.println(a);
                hm.put(a.accountnumber, a);
            }

            ois.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        FileOutputStream fos = new FileOutputStream("Account.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Menu");
        Scanner sc = new Scanner(System.in);
        int choice;
        String accountNumber;
        String name;
        long balance;

        do {
            System.out.println("\n1 for Create Account");
            System.out.println("2 for Delete Account");
            System.out.println("3 for  View Account");
            System.out.println("4 for View All Accounts");
            System.out.println("5 for Save Accounts");
            System.out.println("6 for Exit\n");
            System.out.print("Enter a Choice :");

            choice = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            switch (choice) {
                case 1:
                    System.out.println("Enter AccountNumber , name and balance: ");
                    accountNumber = sc.nextLine();
                    name = sc.nextLine();
                    balance = sc.nextLong();
                    a = new Account(accountNumber, name, balance);
                    hm.put(accountNumber, a);
                    System.out.println("Account Created for " + name);
                    break;

                case 2:
                    System.out.print("Enter Account number : ");
                    accountNumber = sc.nextLine();
                    hm.remove(accountNumber);
                    break;
                case 3:
                    System.out.print("Enter Account number :");
                    accountNumber = sc.nextLine();
                    a = hm.get(accountNumber);
                    System.out.println(a.toString());
                    break;
                case 4:
                    for (Account acc : hm.values()) {
                        System.out.println(acc);
                    }
                    break;
                case 5:
                case 6:
                    oos.writeInt(hm.size());
                    for (Account x : hm.values()) {
                        oos.writeObject(x);
                    }

            }
        } while (choice != 6);

        oos.flush();
        oos.close();
        fos.close();

    }

}