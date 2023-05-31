import java.util.LinkedHashSet;

class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(40);
        lhs.add(50);
        lhs.add(30);
        System.out.println(lhs);
    }
}

// LinkedHashSet --> give Element in same order as gave it
// HashSet --> give Element in According to ASCII order