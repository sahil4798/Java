import java.util.ArrayList;

class ArrayList1 {
    public static void main(String[] args) {

        // ArrayList<String> cars = new ArrayList<String>();
        // cars.add("Tata");
        // cars.add("Mahindra");
        // cars.add("Tesla");
        // System.out.println(cars.get(0));

        ArrayList<Integer> rollno = new ArrayList<Integer>();
        rollno.add(1616);
        rollno.add(288);
        rollno.add(2292);
        rollno.add(282);
        System.out.println(rollno);

        for (int i = 0; i < rollno.size(); i++) {
            System.out.println(rollno.get(i));
        }

    }
}