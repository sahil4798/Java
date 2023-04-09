import java.util.*;

class Test {
    static {
        System.out.println("Block-1");
    }
    static {
        System.out.println("Block-2");
    }

}

class StaticBlock {
    // static {
    // System.out.println("Block in main-1");
    // }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("main");

    }

    // static {
    // System.out.println("Block in main-2");
    // }
}
