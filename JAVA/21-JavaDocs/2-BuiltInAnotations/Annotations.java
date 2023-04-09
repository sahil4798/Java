import java.util.*;

////OVERRIDE
// class OldClass {
//     void display() {
//     }

// }

// class NewClass extends OldClass {
//     @Override
//     void display() {
//         System.out.println("Hiithere");
//     }
//     // @Override
//     // void displya() {
//     // System.out.println("Hiithere");
//     // }
// }

// // DEPRECATED
// class OldClass {
//     @Deprecated
//     void show() {
//         System.out.println("Heloo");
//     }

//     void display() {
//         System.out.println("Hii");
//     }
// }

////SAFEVARARGS
// class MY<T> {
//     @SafeVarargs
//     private void show(T... arg) {
//         for (T x : arg) {
//             System.out.println(x);
//         }
//     }
// }

////FUNCTIONALINTERFACE

@FunctionalInterface
interface Mine {
    public void show();
    // public void display();
}

class Annotations {

    // static List li;

    // @SuppressWarnings("deprecation")
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // // DEPRECATED
        // OldClass o1 = new OldClass();
        // o1.show(); // ERROR

        // //SUPRESSWARNINGS
        // li.add(10);

        //// SAFEVARARGS
        // My m = new My(3);

    }
}

// Annotations
// in-built Annotations
// 1. @Override
// 2. @Deprecated
// 3. @FunctionalInterface
// 4. @SuppressWarnings
// 5. @SafeVarargs