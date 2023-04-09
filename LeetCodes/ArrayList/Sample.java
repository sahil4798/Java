import java.util.ArrayList;

class Sample {
    public static void main(String[] args) {
        // create an ArrayList of String Array type
        ArrayList<String[]> list = new ArrayList<String[]>();

        // create a string array called Names
        String names[] = { "Rohan", "Ritik", "Prerit" };

        // create a string array called Age
        String age[] = { "23", "20" };

        // create a string array called address
        String address[] = { "Lucknow", "Delhi", "Jaipur" };

        // add the above arrays to ArrayList Object
        list.add(names);
        list.add(age);
        list.add(address);

        // print arrays from ArrayList
        for (String i[] : list) {
            // System.out.println(Arrays.toString(i));
            // System.out.println(Arrays.toString(i));
        }
    }
}
