class StackOverFlow extends Exception {
    public String toString() {
        return "Stack is Full";
    }
}

class StackUnderFlow extends Exception {

    public String toString() {
        return "Stack Underflow-Flows";
    }

}

class StackClass {
    int top = -1;
    int size;
    int A[];

    public StackClass(int s) {
        size = s;
        A = new int[size];
    }

    public void push(int key) throws StackOverFlow {
        if (top == size - 1) {
            throw new StackOverFlow();

        }
        top++;
        A[top] = key;
    }

    public int pop() throws StackUnderFlow {
        int x = -1;
        if (top == -1) {
            throw new StackUnderFlow();
        }

        x = A[top];
        top--;
        return x;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
    }
}

class StudentChallenge {

    public static void main(String[] args) {
        StackClass s = new StackClass(5);

        try {

            s.push(1);
            s.push(1);
            s.push(1);
            s.push(1);
            s.push(1);
            s.push(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        s.display();

        // try {

        // s.pop();
        // s.pop();
        // s.pop();
        // s.pop();
        // s.pop();
        // s.pop();
        // } catch (StackUnderFlow e) {
        // System.out.println(e);
        // }
        // s.display();

    }
}