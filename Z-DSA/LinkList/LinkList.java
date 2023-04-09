class Node {
    private int data;
    private Node next;

    Node create(int arr[]) {
        Node first = new Node();
        first.data = arr[0];
        first.next = null;
        Node t = first;
        for (int i = 1; i < arr.length; i++) {
            Node p = new Node();
            p.data = arr[i];
            p.next = null;
            t.next = p;
            t = p;
        }
        return first;
    }

    void display(Node f) {
        while (f != null) {
            System.out.print(f.data + " ");
            // System.out.print(1);
            f = f.next;
        }
        System.out.println("");
    }

    void push(int position, int key) {
        Node p = new Node();
        p = this;
        for (int i = 0; i < position - 2; i++) {
            p = p.next;
        }

        try {
            Node t = new Node();
            t.data = key;
            t.next = p.next;
            p.next = t;
        } catch (NullPointerException e) {
            System.out.println("Invalid position");
        }

    }

    void pop(int position) {
        Node p = new Node();
        p = this;
        Node q = new Node();
        for (int i = 0; i < position - 1; i++) {
            q = p;
            p = p.next;
        }
        if (p != null) {
            q.next = p.next;
        } else {
            System.out.println("Invalid position");
        }

    }

};

class LinkList {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Node f = new Node();
        f = f.create(arr);
        f.display(f);
        // f.push(10, 100);
        // f.display(f);
        f.pop(9);
        f.display(f);

    }
}