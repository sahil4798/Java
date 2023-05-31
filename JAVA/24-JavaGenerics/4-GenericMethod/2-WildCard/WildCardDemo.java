class A {

}

class B extends A {
}

class C extends B {
}

@SuppressWarnings("unchecked")
class Data<T> {
    T array[] = (T[]) new Object[20];
    int l = 0;

    void append(T x) {
        array[l] = x;
        l++;
    }

    void show() {
        for (int i = 0; i < l; i++) {
            System.out.println(array[i] + " ");
        }
    }

}

class WildCardDemo {

    // static <T> void fun(Data<? super C> x) {
    static void fun(Data<? extends A> x) {
        x.show();
        System.out.println("fun Method");
    }

    public static void main(String[] args) {

        Data<B> d1 = new Data<>();
        // d1.append(10);
        // d1.append(20);

        Data<A> d2 = new Data<>();
        // d2.append("HII");
        // d2.append("Aahil");

        fun(d1);
        // fun(d2);
    }
}

// 1-Generic Methods--> bound
// 2. WildCard -->?
// 3.Lower Bound -->super
// 4.Upper Bound -->extends

// Video-5
// 1. Only extends is allowed in Generic class definition
// 2. extends is used for interfaces also
// 3. extends from Only one class and multiple interfaces
// 4. extends and super are allowed with ?)n methods
// 5. <?> will accept all types but cannot access
// 6. Base type of an Object should be same or ?
