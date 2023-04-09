import java.lang.*;

class RegularExpression {

    public static void main(String[] args) {

        System.out.println("Matching Symbols");
        String str1 = "a";
        System.out.println(str1.matches("."));
        String str2 = "b";
        System.out.println(str2.matches("[abc]"));
        String str3 = "ax";
        System.out.println(str3.matches("[abc][xyz]"));
        String str4 = "a";
        System.out.println(str4.matches("[^abc]"));
        String str5 = "8";
        System.out.println(str5.matches("[a-h0-9]"));
        String str6 = "A";
        System.out.println(str6.matches("A|B"));
        String str7 = "AB";
        System.out.println(str7.matches("AB"));

        System.out.println("Meta Charaters");
        String s1 = "9";
        System.out.println(s1.matches("\\d"));
        String s2 = "a";
        System.out.println(s2.matches("\\D"));
        String s3 = " ";
        System.out.println(s3.matches("\\s"));
        String s4 = " ";
        System.out.println(s4.matches("\\S"));
        String s5 = "4";
        System.out.println(s5.matches("\\w"));
        String s6 = "$";
        System.out.println(s6.matches("\\W"));

        System.out.println("Quantifers");
        String c1 = "whgdsvwy  u0u9ws$u";
        System.out.println(c1.matches(".*"));
        String c2 = "9848622929";
        System.out.println(c2.matches("\\d*"));
        String c3 = "aaabbccddc";
        System.out.println(c3.matches("[a-z]*"));

        String c4 = "a";
        System.out.println(c4.matches(".+"));
        String c5 = "";
        System.out.println(c5.matches(".+"));
        String c6 = "abdcc";
        System.out.println(c6.matches("[abcd]{5}"));
        String c7 = "abdccacd";
        System.out.println(c7.matches("[abcd]{5,10}"));
        String c8 = "abdccaabbdccd";
        System.out.println(c8.matches("[abcd]{5,10}"));

        System.out.println("******Regular expression********");
        String a = "sahilverma6353@gmail.com";
        System.out.println(a.matches(".*gmail.*"));
        System.out.println(a.matches("\\w*@gmail.*"));
    }
}