import java.lang.reflect.*;

class My {
    private int a;
    protected float b;
    public double c;
    int d;

    public My() {
    }

    public My(int x, int y) {
    }

    public void display() {
    }

    public void add(int x, int y) {
    }

    public void crypt(int x) {
    }

    void decrypt(int x) {
    }
}

class ReflectionPackage {

    public static void main(String[] args) {

        // My m = new My();
        // Class c = m.getClass() ;

        Class c = My.class;
        System.out.println(c.getName());

        //// For to get data-members of class
        // Field field[] = c.getDeclaredFields();
        // for (Field f : field) {
        // System.out.println(f);
        // }

        //// For to get constructor
        // Constructor con[] = c.getConstructors();
        // for (Constructor ct : con) {
        // System.out.println(ct);
        // }

        System.out.println("***************Methods of class My******************");
        
        Method methods[] = c.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        
        System.out.println("**************Parameter of class My*****************");
        Parameter para[] = methods[0].getParameters();
        for (Parameter p : para) {
            System.out.println(p);
        }

    }
}
