import java.lang.*;

class ForLoop {

    public static void main(String[] args) {

        // for (int i = 0; i <= 10; i++) {
        // System.out.println(i);
        // }

        // int i = 0;
        // for (; i < 11; i++) {
        // System.out.println(i);
        // }

        // int i = 0;
        // for (; i < 11;) {
        // System.out.println(i);
        // i++;
        // }

        for (int i = 0, j = 1; i < 11; i++, j = j * 2) {
            System.out.println(i + " " + j);

        }

    }
}