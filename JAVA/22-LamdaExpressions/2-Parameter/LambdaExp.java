import java.util.Scanner;

@FunctionalInterface
interface MyLambda {
    // interface --> MyLambda is Called Functional Interface
    public int sum(int x, int y);

}

// class Second implements MyLambda {

// public void display() {
// System.out.println("HII THERE");
// }
// }

class LambdaExp {

    public static void main(String[] args) {

        MyLambda obj = (a, b) -> a + b;

        // MyLambda obj = (a, b) -> {
        // return a + b;
        // };

        int x = obj.sum(20, 30);
        System.out.println(x);
    }
}