import javax.xml.transform.Source;

class WrapperClass {

    public static void main(String[] args) {

        System.out.println("****************Integer********************");
        Integer i1 = 10;
        System.out.println(i1);
        // Integer i2 = new Integer(20); //Error
        Integer i3 = Integer.valueOf(10); // Highly Recommended
        System.out.println(i3);

        System.out.println("****************Byte********************");
        Byte b1 = 10;
        System.out.println(b1);
        // Byte b2 = Byte.valueOf(20); // Error Must assign value
        byte b3 = 20;
        Byte b4 = Byte.valueOf(b3);
        System.out.println(b4);
        /// Or
        Byte b5 = Byte.valueOf("20");
        System.out.println(b5);

        System.out.println("****************Short********************");
        Short s1 = 200;
        System.out.println(s1);
        short s2 = Short.valueOf(s1);
        Short s3 = Short.valueOf("300");
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("****************Float********************");

        Float f1 = 19.8f;
        Float f2 = Float.valueOf(15.3f);
        Float f3 = Float.valueOf("130.3");
        Float f4 = Float.valueOf(f1);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        System.out.println("****************Other********************");

        Double d = Double.valueOf(1762.9);
        Character c = Character.valueOf('A');
        Boolean by = Boolean.valueOf(true);
        System.out.println(d);
        System.out.println(c);
        System.out.println(by);

        // "****************UnBoxing********************"
        Integer m1 = Integer.valueOf(20);
        int m2 = m1; // Auto-UnBoxing
        int m3 = m1.intValue(); // UnBoxing

        // "****************Boxing********************"
        int n1 = 10;
        Integer n2 = Integer.valueOf(n1);
        Integer n3 = n1; // Auto-Boxing
    }
}