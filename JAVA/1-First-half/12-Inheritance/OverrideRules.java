//Return-Type-Rule
class A {
    public void display() {
        System.out.println(" A display.");
    }

}

class B extends A {
    public void display() {
        System.out.println(" B display.");
    }

}

class Super {

    public A display() {
        System.out.println("Super display.");
        return new A();
    }
}

class Sub extends Super {

    public B display() {
        System.out.println("Sub diaplay.");
        return new B();
    }
}

// Access specifer Rule

// class Super {
// private void display()
// // or even protected may not give any error.
// {
// System.out.println("Super display.");

// }
// }

// class Sub extends Super {
// // @Override if public
// public void display() {
// System.out.println("Sub diaplay.");

// }
// }

public class OverrideRules {

    public static void main(String[] args) {

        Super s = new Sub();
        s.display();

    }

}