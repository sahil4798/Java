class GenericDemo {

    public static void main(String[] args) {

        // // CLASS OBJECT
        // Object obj = new String("Ahil Ucihiya");
        // System.out.println(obj);
        // String str = (String) obj;
        // System.out.println(str);
        // // obj = 90; //ERROR

        // Array of Object
        Object o[] = new Object[3];
        o[0] = "Aahil";
        o[1] = "Ucihiya";
        // o[2] = 738;// ERROR

        for (Object x : o) {
            System.out.println((String) x);
        }

    }
}