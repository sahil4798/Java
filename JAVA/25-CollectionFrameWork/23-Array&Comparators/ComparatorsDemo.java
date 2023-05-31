import java.util.*;

class MyComp implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {

        if (i1 < i2)
            return 1;
        if (i1 > i2)
            return -1;

        else
            return 0;

    }
}

class ComparatorsDemo {

    public static void main(String[] args) {
        Integer i[] = { 2, 4, 8, 3, 1, 9, 5 };
        // Arrays.sort(i);
        // for (Integer x : i)
        // System.out.print(x + " ");
        Arrays.sort(i, new MyComp());
        for (Integer x : i)
            System.out.print(x + " ");
    }
}