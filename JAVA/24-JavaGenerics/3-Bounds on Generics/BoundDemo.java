//Bound
class A {
}

class B extends A {
}

class C extends A {
}

@SuppressWarnings("unchecked")
class Data<T extends A> {
    T array[] = (T[]) new Object[20];
    int l = 0;

    void append(T x) {
        array[l] = x;
        l++;
    }

    void show() {
        for (int i = 0; i < l; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

//// Subtypes
// class Data2<T> extends Data<T> {

// }

class BoundDemo {

    public static void main(String[] args) throws Exception {

        Data<B> d = new Data<>();

        // d.append(89);
        // d.append("bjsa");
        // d.append("Ara Ara");

        // d.show();

    }
}

// 1. No Parameters
// 2. Multiple Parameters
// 3. Subtypes
// 4. Bounded Types