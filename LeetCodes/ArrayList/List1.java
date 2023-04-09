import java.util.List;
import java.util.ArrayList;

class List1 {

    public static void main(String[] args) {

        ArrayList<Integer> li = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        for (int x : list) {
            System.out.println(x);
        }

    }
}