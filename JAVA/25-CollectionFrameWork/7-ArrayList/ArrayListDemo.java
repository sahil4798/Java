import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(0, 5);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        al1.addAll(1, al2);

        al1.set(2, 2000);

        // for (int i = 0; i < al1.size(); i++) {
        // System.out.print(al1.get(i) + " ");
        // }
        // for (Integer x : al1) {
        // System.out.print(x + " ");
        // }

        // for (ListIterator<Integer> it = al1.listIterator(); it.hasNext();) {
        // System.out.print(it.next() + " ");
        // }

        al1.forEach(x -> System.out.print(x + " "));

    }
}