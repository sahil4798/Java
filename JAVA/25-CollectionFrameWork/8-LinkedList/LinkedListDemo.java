import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();

        LinkedList<Integer> al2 = new LinkedList<>(List.of(10, 20, 30, 40, 50));

        al1.add(10);
        al1.add(0, 5);

        al1.addAll(1, al2);

        al1.addFirst(0);
        al1.addLast(1000);

        // System.out.println(al1.peek());
        // System.out.println(al1.peekFirst());
        // System.out.println(al1.pollLast());

        // al1.forEach(i -> System.out.print(i + " "));
        al1.forEach(n -> fun(n));

    }

    static void fun(int x) {
        System.out.print(x + " ");
    }
}