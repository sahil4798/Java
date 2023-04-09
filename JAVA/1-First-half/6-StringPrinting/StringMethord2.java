import java.lang.*;

class StringMethord2 {

    public static void main(String[] args) {
        String str = "Monkey D Luffy";
        // String str1 = str.startsWith(Mr, 0); //Error
        System.out.println(str.startsWith("Monkey"));
        System.out.println(str.startsWith("D", 7));
        System.out.println(str.endsWith("luffy"));

        System.out.println("Char at Index 9 : " + str.charAt(9));

        String str1 = "www.loki.com";
        System.out.println(str1.indexOf("loki"));
        System.out.println(str1.indexOf('.', 5));
        System.out.println(str1.lastIndexOf('.'));

        System.out.println("****** *******str.equals*****************");
        String s1 = "Madara";
        String s2 = "Madara";
        String s3 = "madara";
        String S4 = new String("Madara");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("Difference bw '==' and equalsMethord");
        System.out.println(s1.equals(S4));
        System.out.println(s1 == S4);

        System.out.println("*************str.Compare****************");
        String c1 = "Shinobi";
        String c2 = "Akatski";
        String c3 = "shinobi";

        System.out.println(c1.compareTo(c2));
        System.out.println(c2.compareTo(c1));
        System.out.println(c1.compareTo(c3));
        System.out.println(c2.compareTo(c3));
        System.out.println(c1.compareToIgnoreCase(c3));

        System.out.println("*****str.Contain****str.concetenate*****");
        String d1 = "Roger is Great King of Pirates ";
        System.out.println(d1.contains("Roger"));
        String d2 = "Luffy will be ";
        String d3 = "next King of Pirates";
        System.out.println(d2.concat(d3));
        System.out.println(d2 + d3);

        System.out.println("***************str.valueOf************");
    }
}