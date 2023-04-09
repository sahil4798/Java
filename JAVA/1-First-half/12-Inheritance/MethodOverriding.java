class Super {
    public void display() {
        System.out.println("Super Display");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Sub Display");
    }
}

class MethodOveriding {

    public static void main(String[] args) {

        // //Overriding
        // Super su = new Super();
        // su.display();

        // Sub sb = new Sub();
        // sb.display();

        // Dynamic Method Dispatch
        Super su = new Sub();
        su.display();

    }
}
