import java.util.HashSet;

class HashSetDemo {

    public static void main(String[] args) {
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

    }
}