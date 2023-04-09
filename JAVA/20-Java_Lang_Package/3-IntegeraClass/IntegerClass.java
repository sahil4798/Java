class IntegerClass {

    public static void main(String[] args) {

        //// **************Methods of Integer-Class*************
        // int m1 = 15;
        // Integer m2 = m1;
        // System.out.println(m2.equals(m1));
        // System.out.println(m2.equals(15));
        // Integer m3 = 40;
        // System.out.println(m2.equals(m3));

        //// **********Static Methods of Integer-Class************
        //// valueOf() is also a static method of Integer Class
        int x = Integer.valueOf(100); // Valid
        System.out.println(x);

        Integer i1 = Integer.valueOf("2000");
        System.out.println(i1);
        Integer i2 = Integer.valueOf("1010", 2);
        System.out.println(i2);
        Integer i3 = Integer.valueOf("A7", 16);
        System.out.println(i3);

        //// ************bitCount and toBinaryString********
        System.out.println(Integer.toBinaryString(10));
        // convent number into binary String
        System.out.println(Integer.bitCount(10));
        // Gives numbers of 1 in 2s Complement of given no

        //// *********************compare()*********************
        System.out.println(Integer.compare(-100, 100));
        System.out.println(Integer.compareUnsigned(-100, 100));

        //// *********************decode()*********************
        System.out.println(Integer.decode("3000"));// decimal
        System.out.println(Integer.decode("0xA7"));// Hexadecimal
        System.out.println(Integer.decode("#A7")); // Hexadecimal
        System.out.println(Integer.decode("0121")); // Octal

        //// *********************parseInt()*********************
        System.out.println(Integer.parseInt("100"));
        // System.out.println(Integer.parseInt("100a"));// Error
        // System.out.println(Integer.valueOf("100a"));// Error

        System.out.println(Integer.reverse(9));

    }
}