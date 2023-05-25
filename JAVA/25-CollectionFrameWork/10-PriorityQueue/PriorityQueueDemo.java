import java.util.*;

class MyComp implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        if (i1 < i2)
            return 1;
        if (i1 > i2)
            return -1;
        return 0;
    }
}

class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());
        pq.add(10);
        pq.add(25);
        pq.add(15);
        pq.add(8);
        pq.add(26);
        pq.add(3);
        System.out.println(pq);
        System.out.println(pq.poll());

        System.out.println("After Deletion");
        System.out.println(pq);
    }
}

// Element are inserted and deleted on basis of priority
// By defult smallest element have highest priority and largest have lowest
// priority.
// In tree , number with highest priority(smallest element) will come on root .
// if we delete element on root will delete first
// PriorityQueue is implemeted by help of BinaryTree And Heap.
