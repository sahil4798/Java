
@FunctionalInterface
interface MyLambda {
    // interface --> MyLambda is Called Functional Interface
    public void display();

}

// class Second implements MyLambda {

// public void display() {
// System.out.println("HII THERE");
// }
// }

class LambdaExp {

    public static void main(String[] args) {

        MyLambda obj = () -> {
            System.out.println("HII THERE");
        };

        // Anonmous Method
        // Anonmous Class

        obj.display();
    }
}