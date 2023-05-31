import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D"));
        tm.put(5, "E");
        tm.put(5, "E");
        System.out.println(tm);
        System.out.println(tm.get(3));
        System.out.println(tm.floorEntry(6).getValue());

        Entry<Integer, String> e = tm.firstEntry();
        System.out.println(e.getKey() + ":" + e.getValue());

    }
}

// TreeSet And TreeMap

//// TreeMap

// 1-A TreeMap is always sorted based on keys. The sorting order follows the
// natural ordering of keys. You may also provide a custom Comparator to the
// TreeMap at the time of creation to let it sort the keys using the supplied
// Comparator.

// 2- A TreeMap cannot contain duplicate keys.

// 3-TreeMap cannot contain the null key. However, It can have null values.

// 4-TreeMap is not synchronized. Access to TreeMaps must be synchronized
// explicitly in a multi-threaded environment.