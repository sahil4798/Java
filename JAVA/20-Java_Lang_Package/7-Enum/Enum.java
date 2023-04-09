import javax.sound.sampled.SourceDataLine;

enum Dept {
    // CS, IT, CIVIL, ECE;
    // private Dept() {
    // System.out.println(this.name());
    // }
    CS("john", "Block-A"), IT("Akutski", "Block-B"), CIVIL("Uqiora", "Block-C"), ECE("Bankhai", "Block-D");

    String head;
    String loc;

    private Dept(String head, String loc) {
        this.head = head;
        this.loc = loc;
    }

    public String getHeadName() {
        return head;
    }

    public String getLocation() {
        return loc;
    }

    public void display() {
        System.out.println(this.name() + " " + this.ordinal());

    }

}

class MyDept {
    static final int CS = 700;
}

class Enum {

    public static void main(String[] args) {
        // Dept d1 = Dept.CS;
        // System.out.println(d1);
        // System.out.println(d1.name());
        // System.out.println(d1.ordinal());
        // System.out.println(Dept.valueOf("CS"));

        // Dept list[] = Dept.values();

        // for (Dept x : list) {
        // System.out.print(x + " ");
        // }

        Dept d2 = Dept.ECE;
        // d2.display();

        System.out.println(d2);

        System.out.println(d2.getHeadName());
        System.out.println(d2.getLocation());

        
    
    }
}