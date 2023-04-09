class StringClass {

    public static void main(String[] args) {
        String S = new String("Hello");

        String S1 = "Hello";
        S1.concat(" World");

        StringBuffer S2 = new StringBuffer("Helllo");
        S2.append(" World");

        StringBuilder S3 = new StringBuilder("Hello");
        S3.append(" World");

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
    }
}