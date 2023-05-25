import java.util.Scanner;

@FunctionalInterface
interface MyLambda {
    // interface --> MyLambda is Called Functional Interface
    public void display();

}

// class More {
// int z = 30;

// public void MoreMethod() {
// final int y = 20;
// MyLambda obj = () -> {
// int x = 10;
// x++;
// z++;
// System.out.println("Hii There " + x);
// System.out.println("Hii There " + y);
// System.out.println("Hii There " + z);
// };
// obj.display();

// }
// }

class First {

    public void firstMethod(MyLambda o) {
        // MyLambda o = () -> System.out.println("HII THERE");
        o.display();
    }
}

class More {

    public void MoreMethod() {
        First f = new First();
        f.firstMethod(() -> System.out.println("HII THERE"));
    }
}

class LambdaExp {

    public static void main(String[] args) {

        More o = new More();
        o.MoreMethod();

    }
}