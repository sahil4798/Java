import java.util.*;

class CoffeeMachine {
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine my = null;
    static int x = 10;

    private CoffeeMachine() {
        coffeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty) {
        waterQty = qty;
    }

    public void fillSugar(float qty) {
        sugarQty = qty;
    }

    public float getCoffee() {
        return 0.15f;
    }

    // static CoffeeMachine getInstance() {
    // if (my == null) {
    // count++;
    // my = new CoffeeMachine();
    // }
    // if (count < 6) {
    // return my;
    // } else {
    // return null;
    // }
    // }

}

public class SingletonDemo2 {
    public static void main(String[] args) {
        // CoffeeMachine.count = 10;
        System.out.println(CoffeeMachine.x);
        // CoffeeMachine m1 = CoffeeMachine.getInstance();
        // System.out.println(CoffeeMachine.count);
        // CoffeeMachine m2 = CoffeeMachine.getInstance();
        // System.out.println(CoffeeMachine.count);
        // CoffeeMachine m3 = CoffeeMachine.getInstance();
        // System.out.println(CoffeeMachine.count);
        // CoffeeMachine m4 = CoffeeMachine.getInstance();
        // System.out.println(CoffeeMachine.count);
        // CoffeeMachine m5 = CoffeeMachine.getInstance();
        // System.out.println(CoffeeMachine.count);
        // CoffeeMachine m6 = CoffeeMachine.getInstance();
        // System.out.println(CoffeeMachine.count);
        // CoffeeMachine m7 = CoffeeMachine.getInstance();

        // System.out.println(m1 + " " + m2 + " " + m3);
        // System.out.println(m4);
        // System.out.println(m5);
        // System.out.println(m6);
        // System.out.println(m7);
        // if (m1 == m2 && m1 == m3)
        // System.out.println("Same");

    }
}