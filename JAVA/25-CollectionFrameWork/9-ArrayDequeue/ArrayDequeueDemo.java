import java.util.ArrayDeque;

class ArrayDequeueDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.addFirst(0);
        ad.add(10);
        ad.addLast(10000);
        ad.offerFirst(-100);
        ad.offerLast(1000000);

        System.out.println(ad.pollLast());
        System.out.println(ad.pollFirst());

        System.out.println(ad);

    }
}

// addFirst offerFirst addLast offerLast
// removeFirst pollFirst removeLast pollLast
// getFirst peekFirst getLast peekLast