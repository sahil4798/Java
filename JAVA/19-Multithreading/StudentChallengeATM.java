import javax.sound.sampled.SourceDataLine;

class ATM {

    synchronized void checkBalance(String name) {
        System.out.print(name + "is checking ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("balance " + name);
    }

    synchronized void withdraw(String name, int amount) {
        System.out.print(name + " is Withdrawing ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(amount);

    }

}

class Customer extends Thread {
    String name;
    int amount;
    ATM a = new ATM();

    Customer(String name, int amount, ATM at) {
        this.name = name;
        this.amount = amount;
        a = at;
    }

    void useATM() {
        a.checkBalance(name);
        a.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}

class StudentChallengeATM {

    public static void main(String[] args) {

        ATM a = new ATM();
        Customer c1 = new Customer("Luffy", 10, a);
        Customer c2 = new Customer("Zoro", 1000, a);
        c1.start();
        c2.start();

    }
}