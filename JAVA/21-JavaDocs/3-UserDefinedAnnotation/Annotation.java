import java.lang.annotation.*;

@interface MyAnno {

    String name();

    String project();

    String date() default "15\1\2023";

    String version() default "17.19";
}

@MyAnno(name = "pikas", project = "bank", date = "26\2\2023")
class Annotation {

    public static void main(String[] args) {

        int count;
    }
}