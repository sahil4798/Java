import java.util.ArrayList;

class ArrayList2 {

    public static void main(String[] args) {
        System.out.println("HII");

        ArrayList<Integer[]> i = new ArrayList<>();
        Integer natural[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer odd[] = { 1, 3, 5, 7, 9 };
        Integer even[] = { 2, 4, 6, 8, 10 };

        i.add(natural);
        i.add(odd);
        i.add(even);

        System.out.println(i);

        for (Integer[] x : i) {
            System.out.println(x);
        }

        for (Integer[] x : i) {
            for (Integer y : x) {
                System.out.print(y);
            }
            System.out.println("");
        }
    }
}