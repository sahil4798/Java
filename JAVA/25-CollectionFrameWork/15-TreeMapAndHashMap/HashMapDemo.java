import java.util.HashMap;
import java.util.Map;

class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D"));

        hm.put(5, "E");
        hm.put(6, "F");
        System.out.println(hm.containsKey(8));
        System.out.println(hm);

    }
}

// HashSet , HashMap

// //HashMap
// 1-A HashMap cannot contain duplicate keys.

// 2-Java HashMap allows null values and the null key.

// 3-HashMap is an unordered collection. It does not guarantee any specific
// order of the elements.

// 4-Java HashMap is not thread-safe. You must explicitly synchronize concurrent
// modifications to the HashMap