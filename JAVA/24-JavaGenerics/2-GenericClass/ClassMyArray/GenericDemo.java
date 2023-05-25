
@SuppressWarnings("unchecked")
class Array<T> {
    T[] array = (T[]) new Object[10];
    int index = 0;

    public void append(T x) {
        array[index] = x;
        index++;
    }

    public void display() {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class GenericDemo {

    public static void main(String[] args) {
        Array<Integer> a = new Array<>();

        a.append(90);
        a.append(11);
        a.append(332);
        a.append(99);

        a.display();

    }
}