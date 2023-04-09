import java.lang.*;

class Car {
    public void start() {
        System.out.println("Car is started");
    }

    public void accelerate() {
        System.out.println("Car is accelerated");
    }

    public void changeGear() {
        System.out.println("Car Gear changed");
    }
}

class LuxaryCar extends Car {

    public void changeGear() {
        System.out.println("LuxaryCar automatic Gear");
    }

    public void openRoof() {
        System.out.println("LuxaryCar roof opend ");
    }

}

class PractiseMethodOverrinding2 {

    public static void main(String[] args) {

        // Car c1 = new Car();
        // c1.start();
        // c1.accelerate();
        // c1.changeGear();

        // LuxaryCar c2 = new LuxaryCar();
        // c2.start();
        // c2.accelerate();
        // c2.changeGear();
        // c2.openRoof();

        Car c3 = new LuxaryCar();
        c3.start();
        c3.accelerate();
        c3.changeGear();
        // c3.openRoof(); // Thow error
    }
}