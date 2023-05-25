@SuppressWarnings("unchecked")
class GenericDemo2<T> {

    T data[] = (T[]) new Object[3];

    public static void main(String[] args) {

        GenericDemo2<String> gd = new GenericDemo2<>();
        gd.data[0] = "HII";
        gd.data[1] = "BYE";
        // gd.data[2] = 99; //ERROR
        gd.data[2] = "KL";

        String str = gd.data[0];

    }
}