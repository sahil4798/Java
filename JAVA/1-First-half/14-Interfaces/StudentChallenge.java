class Store {
    Member mem[] = new Member[10];
    int count = 0;

    public void register(Member m) {
        mem[count++] = m;
    }

    public void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callBack();
        }
    }

}

interface Member {
    public void callBack();
}

class Custumer implements Member {
    String name;

    Custumer(String n) {
        name = n;
    }

    public void callBack() {
        System.out.println("Ohk I will Visit " + name);
    }
}

class StudentChallenge {

    public static void main(String[] args) {

        Store s = new Store();

        Custumer c1 = new Custumer("smith");
        Custumer c2 = new Custumer("sabo");

        s.register(c1);
        s.register(c2);

        s.inviteSale();

    }
}