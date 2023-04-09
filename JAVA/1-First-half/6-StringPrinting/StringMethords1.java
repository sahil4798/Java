import java.lang.*;

class StringMethords1 {

    public static void main(String[] args) {

        String str = "Java";
        int lenght = str.length();
        System.out.println(lenght);
        String str1 = str.toLowerCase();
        System.out.println(str); // str is uneffected by methord
        System.out.println(str1);

        String s1 = "  kenpachi  ";
        s1 = s1.trim();
        System.out.println(s1);

        String s2 = s1.substring(3, 7);
        System.out.println(s2);

        String s3 = s1.replace('p', 'h');
        System.out.println(s3);

    }
}