class NegativeDimensionException extends Exception {
    public String toString() {
        return "Given Dimension of rectangle can't negative";
    }
}

class Demo2 {

    static int area(int l, int b) throws Exception {
        if (l < 0 || b < 0) {
            throw new NegativeDimensionException();
        }
        return l * b;
    }

    static void meth1() throws Exception {
        System.out.println("Area of rectangle is :" + area(-10, 5));
    }

    public static void main(String[] args) {
        try {

            meth1();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}