import java.lang.*;

class TV {
    public void switchOn() {
        System.out.println("TV is Switched On");
    }

    public void changeChannel() {
        System.out.println("TV Channel is Changed");
    }
}

class SmartTV extends TV {
    public void switchOn() {
        System.out.println("Smart-TV is Switched On");
    }

    public void changeChannel() {
        System.out.println("Smart-TV Channel is Changed");
    }

    public void brouse() {
        System.out.println("Browsing on Smart T.V");
    }
}

class PractiseMethodOverrinding1 {

    public static void main(String[] args) {

        // //Method Overriding
        // TV t1 = new TV();
        // t1.switchOn();
        // t1.changeChannel();

        // SmartTV t2 = new SmartTV();
        // t2.switchOn();
        // t2.changeChannel();

        // Dynamic Method Dispatch
        TV t3 = new SmartTV();
        t3.switchOn();
        t3.changeChannel();
        // t3.brouse(); //Throw error

    }
}