import java.lang.*;

class StudentChallenge3 {

    public static void main(String[] args) {

        String str = "A1B@g$6*d+wj)";
        System.out.println(str.replaceAll("\\W", ""));
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

        // Removing all the spaces
        String str2 = " My  passion is  hotter than Fire$  ";
        System.out.println(str2.replaceAll(" ", ""));
        System.out.println(str2.replaceAll("\\s", ""));

        // Removing extra spaces betwwen the Words
        String str3 = "  My  passion is  hotter than Fire$   ";
        System.out.println(str3.replaceAll("\\s+", " ").trim());
        // System.out.println(str3.trim());

        // Find Number of Words in sententenses
        String str4 = "  My  passion is  hotter than Fire$   ";
        // System.out.println(str4.replaceAll("\\s+", " ").trim());
        str4 = str4.replaceAll("\\s+", " ").trim();
        String S[] = str4.split("\\s");
        System.out.println(S.length);

        // Just anew thing
        String S1[] = { "this", "is" };
        System.out.println(S1.length);

    }
}