import java.lang.*;

class VariableArgunment {

    // // Case-1
    // static void show(int... x) {
    // for (int a : x) {
    // System.out.print(a + " ");
    // }
    // System.out.println(" ");
    // }

    static void showList(int c, String... str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(c + "." + str[i]);
            c++;
        }
    }

    public static void main(String[] args) {

        // // Case-1
        // show();
        // show(10);
        // show(10, 20);
        // show(10, 20, 30);
        // int A[] = { 1, 2, 3, 4, 5 };
        // show(A);
        // show(new int[] { 2, 4, 6, 8, 10 });

        // Case-2
        showList(5, "Akaino", "Akigi", "Kizaru", "Vice");

    }
}