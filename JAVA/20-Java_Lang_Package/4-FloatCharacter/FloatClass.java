class FloatClass {

    public static void main(String[] args) {

        float f1 = 12.45f;
        Float f2 = 12.45f;
        System.out.println(f2.equals(f1));

        Float f3 = 27.29f / 0;
        Float f4 = -27.29f / 0;
        System.out.println(f3);
        System.out.println(f3.isInfinite()); // used as Method
        System.out.println(Float.isInfinite(f3));// As static Method
        System.out.println(f3 == Float.POSITIVE_INFINITY);
        System.out.println(f3 == Float.NEGATIVE_INFINITY);

        Float f5 = (float) Math.sqrt(-1);
        System.out.println(f5.isNaN()); // used as Method
        System.out.println(Float.isNaN(f5));// As static Method

        //// ******************Jalwa of NaN********************
        System.out.println(Float.NaN == Float.NaN);
        System.out.println(f5 == Float.NaN);
        System.out.println(f1 == Float.NaN);
        System.out.println(Float.NaN != Float.NaN);
        System.out.println(f5 != Float.NaN);
        System.out.println(f1 != Float.NaN);

    }
}