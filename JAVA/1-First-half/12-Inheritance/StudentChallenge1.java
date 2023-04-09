import java.lang.*;

class Account {
    private String accNo;
    private String name;
    private String adress;
    private String phno;
    private String dOB;
    double balance;

    public Account(String accNo, String name, String adress, String phno, String dOBString, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.adress = adress;
        this.phno = phno;
        this.dOB = dOB;
        this.balance = balance;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getAdress() {
        return adress;
    }

    public String getName() {
        return name;
    }

    public String getPhno() {
        return phno;
    }

    public String getdOB() {
        return dOB;
    }

    public double getBalance() {
        return balance;
    }
}

// class SavingsAccount extends Account {
// public double deposit(double ammount) {
// balance = balance + ammount;
// return balance;
// }

// public double withdraw(double amount) {
// balance = balance - amount;
// return balance;
// }

// // public double fixedDeposit(){}
// // public void liquidate(){}

// }

// class LoanAccount extends Account {
// // public void payEMI() {
// // }

// // public void topupLoan() {
// // }

// // public void repayment() {
// // }
// }

class LoadAccount {

}

public class StudentChallenge1 {

    public static void main(String[] args) {

    }
}