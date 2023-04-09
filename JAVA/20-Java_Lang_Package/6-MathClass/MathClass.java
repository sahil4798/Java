class MathClass {

    public static void main(String[] args) {

        System.out.println("Absolute : " + Math.abs(-72));
        System.out.println("Absolute : " + StrictMath.abs(-72));

        System.out.println(Math.min(10, -39));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.decrementExact(9));

        // int x = Integer.MIN_VALUE;
        // x--;
        // System.out.println(x);
        // System.out.println(Math.decrementExact(Integer.MIN_VALUE));

        // Study Mantisa and exponent , floating point representation
        System.out.println(Math.getExponent(27.0));

        System.out.println("Floor value of division of 13 by 2" + Math.floorDiv(13, 2));

        System.out.println("e power 3 : " + StrictMath.exp(3));
        System.out.println("e power 3 : " + Math.exp(3));

        System.out.println("log10(10) : " + Math.log10(100));

        System.out.println(" tan(45•) : " + Math.tan(Math.PI / 180 * 45));
        System.out.println(" tan-(45) : " + Math.toDegrees(Math.atan(1)));
        System.out.println(" tanh(1) : " + Math.toDegrees(Math.tanh(1)));

        System.out.println(Math.multiplyExact(1000, 4900));

        System.out.println(Math.nextAfter(12.3, 13));
        System.out.println(Math.nextAfter(12.3, 12));

    }
}