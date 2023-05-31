import java.util.*;

class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 20, 30, 40, 50, 60, 60));
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
// KeyValue Points of TreeSet
// 1-TreeSet is a powerful data structure in Java that provides a way to store
// elements in a sorted order.
// 2-It does not allow duplicate elements. If we try to add a duplicate element
// to the TreeSet, it will be ignored.
// 3-TreeSet sorts elements in a natural order, depending on the type of
// elements present in it. For example, if the TreeSet contains string objects,
// the natural order is alphabetical.