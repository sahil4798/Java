import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

// @Retention(RetentionPolicy.CLASS)

// @Documented

// @Target(value = ElementType.LOCAL_VARIABLE)
// @Target(value = { ElementType.LOCAL_VARIABLE, ElementType.METHOD })

// @Repeatable(MyAnno.class);  //Syntax only

@interface MyAnno {
    String name();

    String project();

    String date() default "15\1\2023";

    String version() default "17.19";
}

class Annotation {

    @MyAnno(name = "pikas", project = "bank", date = "26\2\2023")
    public static void main(String[] args) {
        int count = 10;

    }
}

// Other in-built Annotations
// 1. Retention
// 2. Documented
// 3. Target
// 4. Inherited
// 5. Repeatable