import java.lang.*;

class System_out {
    public static void main(String[] args) {

        // comversion
        int x = 10, y = 20;
        System.out.println(x + y);
        System.out.println("Sum " + x);
        System.out.println("Sum :" + x + y);
        System.out.println("Sum : " + (x + y));
        System.out.println("Sum of " + x + " and " + y + " is " + (x + y));
        System.out.printf("The value of x and y is %d %d \n", x, y);

        // Argunment Index
        int i = 10;
        float f = 12.25f;
        String str = "hello";
        System.out.printf("The value of x is %d %o %x \n", i, i, i);
        System.out.printf(" %1$d %1$d  %1$d \n ", i);
        System.out.printf(" %1$d %2$f %1$d \n ", i, f, str);
        System.out.printf(" %1$d %2$f  %3$s\n ", i, f, str);

        // width
        int a1 = 134;
        System.out.printf("%d\n", a1);
        System.out.printf("%6d\n", a1);
        float a2 = 12.96f;
        System.out.printf("%f  \n", a2);
        System.out.printf("%6.2f \n", a2);
        System.out.printf("%8.3f \n", a2);

        // Flag

        System.out.printf("%06d \n", a1);
        System.out.printf("%(6d \n", a1);
        int a3 = -120;
        System.out.printf("%(6d \n", a3);
        String a4 = "Zabu";
        System.out.printf("%20s \n", a4);
        System.out.printf("%-20s \n", a4);

    }
}

// %[Argunmentindex$][flag][width]conversion
