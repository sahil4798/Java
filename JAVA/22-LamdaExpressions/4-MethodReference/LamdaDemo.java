// package lamdademo;

@FunctionalInterface
interface Lamda {
    public void display(int x, int y);
}

public class LamdaDemo {
    public LamdaDemo() {
    }

    public LamdaDemo(int a, int b) {
        System.out.println("HIII THERE " + a + " " + b);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        // Lamda l = LamdaDemo::add;
        // l.display(9, 7);

        LamdaDemo obj = new LamdaDemo();
        Lamda l = obj::sum;
        l.display(9, 7);

        // Lamda l = LamdaDemo::new;
        // l.display(9, 7);

    }
}
