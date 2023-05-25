class GenericMethodDemo {

    // static <T> void show(T A[]) {
    // for (T x : A) {
    // System.out.println(x);
    // }

    // }

    static <T> void show(T... A) {
        for (T x : A) {
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        // show(new Integer[] { 1, 2, 3, 4, 5 });

        show(1, 2, 3, 4, 5);

    }
}