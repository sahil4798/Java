import java.util.*;

class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 20, 30, 40, 50));
        ts.add(25);
        System.out.println(ts.ceiling(35));
        System.out.println(ts.floor(35));
        System.out.println(ts.descendingSet());

        // for (Iterator<Integer> it = ts.iterator(); it.hasNext();) {
        for (Iterator<Integer> it = ts.descendingIterator(); it.hasNext();) {

            System.out.print(it.next() + " ");

        }

    }
}