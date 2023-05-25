class Data<T> {
    private T x;

    public void setData(T t) {
        x = t;
    }

    public T getData() {
        return x;
    }
}

class GenericClassDemo {

    public static void main(String[] args) {

        Data<String> d = new Data<>();
        d.setData("Ahhil");
        System.out.println(d.getData());

    }
}