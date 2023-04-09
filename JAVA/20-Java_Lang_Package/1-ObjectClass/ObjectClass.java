class MyObject {
    public String toString() {
        return "toString method is override sucessfully";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(MyObject o) {
        if (this.hashCode() == o.hashCode()) {
            return true;
        } else {
            return false;
        }
    }
}

class MyObject2 {

}

class ObjectClass {
    public static void main(String[] args) {
        // Object o1 = new Object();
        // System.out.println(o1);
        // System.out.println(o1.toString());
        // System.out.println(o1.hashCode());
        // System.out.println(o1.getClass());
        // Object o2 = new Object();
        // System.out.println(o1.equals(o2));

        MyObject o1 = new MyObject();
        System.out.println(o1.toString());
        System.out.println(o1.hashCode());
        System.out.println(o1.getClass());
        System.out.println(o1.hashCode());
        System.out.println(o1.getClass());

        MyObject o2 = new MyObject();
        System.out.println(o1.hashCode());
        System.out.println(o1.equals(o2));

    }
}