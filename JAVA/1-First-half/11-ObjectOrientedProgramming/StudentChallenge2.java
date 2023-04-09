import java.lang.*;

class Product {
    private String itemno;
    private String name;
    private double price;
    private int qty;

    public Product(String a, String b) {
        itemno = a;
        name = b;
        price = 0.0;
        qty = 0;

    }

    public Product(String a, String b, double c, int d) {
        itemno = a;
        name = b;
        price = c;
        qty = d;
    }

    // public void setItemNo(String s) {
    // itemno = s;
    // } //Not Required

    // public void setName(String s) {
    // name = s;
    // } //No Required

    public void setPrice(double s) {
        price = s;
    }

    public void setQuantity(int s) {
        qty = s;
    }

    public String getItemNo() {
        return itemno;
    }

    public String getNameString() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return qty;
    }

}

class Customer {
    String custId;
    String name;
    String address;
    String phno;

    public String getCustomerId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phno;
    }

    // public void SetCustomerId(String str) {
    // custId = str;
    // } //Not Requried
    // public void SetName(String str) {
    // name = str;
    // } //Not Requried

    public void SetAdress(String str) {
        address = str;
    }

    public void SetPhoneNumber(String n) {
        phno = n;
    }

    public Customer(String a, String b) {
        custId = a;
        name = b;

    }

    public Customer(String a, String b, String c, String d) {
        custId = a;
        name = b;
        address = c;
        phno = d;

    }

}

class StudentChallenge2 {

    public static void main(String[] args) {

        //// For ClassProduct
        // Product p = new Product("#21ATK", "Toothpase");
        // System.out.println("ItemNo :" + p.getItemNo());
        // System.out.println("Name :" + p.getNameString());
        // System.out.println("Price :" + p.getPrice());
        // System.out.println("Quantity :" + p.getQuantity());

        // Product p = new Product("#21ATK", "Toothpase", 376.90, 8);
        // System.out.println("ItemNo :" + p.getItemNo());
        // System.out.println("Name :" + p.getNameString());
        // System.out.println("Price :" + p.getPrice());
        // System.out.println("Quantity :" + p.getQuantity());

        //// For Class Customer
        // Customer c = new Customer("#BHS78G", "Sahil");
        // System.out.println("CustId :" + c.getCustomerId());
        // System.out.println("Name :" + c.getName());
        // System.out.println("Address :" + c.getAddress());
        // System.out.println("PhoneNumber:" + c.getPhoneNumber());

        Customer c = new Customer("#BHS78G", "Sahil", "Noida-201313-Raipur", "0289230832");
        System.out.println("CustId :" + c.getCustomerId());
        System.out.println("Name :" + c.getName());
        System.out.println("Address :" + c.getAddress());
        System.out.println("PhoneNumber:" + c.getPhoneNumber());

    }
}