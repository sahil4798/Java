import java.lang.*;

class StudentChalenge1 {

    public static void main(String[] args) {

        String str = "sahilverma6353@gmail.com";
        System.out.println(str.matches("\\w*@gmail.*"));
        System.out.println(str.matches("\\w*@[gmail]*.[com]*"));
        System.out.println(str.matches("\\w*\\W{1}[a-z]*.[com]*"));

        System.out.println(str.substring(15, 20) == "gmail");
        System.out.println(str.matches("[a-z0-9]*\\W{1}gmail\\W{1}com"));

        // String username[], damian[];
        // String gamil[] = str;
        // int i = 0;
        // while (gmail[i] != '@') {
        // username[i] = gmail[i];
        // }
        // System.out.println(gamil);

        int index = str.indexOf('@');
        System.out.println(str.substring(0, index));
        System.out.println(str.substring(index + 1, str.length()));
        int index_of_dot = str.indexOf('.');
        String str2 = str.substring(index + 1, index_of_dot);
        System.out.println(str2.equals("gmail"));
        System.out.println(str.compareTo("gmail"));
        // System.out.println(str2.length());

    }
}