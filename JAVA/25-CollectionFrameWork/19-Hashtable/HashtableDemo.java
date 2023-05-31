import java.util.Enumeration;
import java.util.Hashtable;

class HashtableDemo {

    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>(16, 0.75f);

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");
        // String s = (String) ht.get(2);
        // System.out.println(s);
        // System.out.println(ht.get(4));

        // System.out.println(ht);

        ht.compute(4, (k, v) -> v + "9");
        ht.computeIfAbsent(8, (k) -> "H-Inserted");

        Enumeration e = ht.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}