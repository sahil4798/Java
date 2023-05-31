import java.util.HashSet;

class HashSetDemo {

    public static void main(String[] args) {
        //// Here will show in Random order
        HashSet<Integer> hs = new HashSet<>(10, 0.75f);
        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(30);
        hs.add(91);
        hs.add(83);
        hs.add(97);
        hs.add(99);
        hs.forEach(x -> System.out.println(x));

        //// Here will show in Ascci order
        // HashSet<String> hs2 = new HashSet<>();
        // hs2.add("A");
        // hs2.add("C");
        // hs2.add("Z");
        // hs2.add("E");
        // hs2.add("D");
        // hs2.forEach(x -> System.out.println(x));

    }
}