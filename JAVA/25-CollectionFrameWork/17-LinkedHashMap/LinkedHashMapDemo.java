import java.util.*;

class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true);
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        String s = lhm.get(2);
        s = lhm.get(5);
        s = lhm.get(4);

        System.out.println(lhm);

    }
}