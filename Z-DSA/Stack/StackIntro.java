import java.util.ArrayList;

class Stack {
    java.util.ArrayList<Integer> stack = new ArrayList<>();
    // private int stack[] = new int[100];

    void create(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }
    }

    void display() {
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println(" ");
    }

    void push(int key) {
        stack.add(key);

    }

    void pop() {
        stack.remove(stack.size() - 1);
    }
}

class StackIntro {

    public static void main(String[] args) {
        Stack st = new Stack();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        st.create(arr);
        st.display();
        st.push(7);
        st.push(8);
        st.push(9);
        st.display();
        st.pop();
        st.pop();
        st.display();

    }
}