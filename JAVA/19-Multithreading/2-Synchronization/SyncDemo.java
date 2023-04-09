class MyData {

    synchronized void display(String str) {

        // synchronized (this) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        // }
    }
}

class MyThread1 extends Thread {

    MyData d = new MyData();

    MyThread1(MyData dat) {
        d = dat;
    }

    public void run() {
        d.display("hello world ");
    }

}

class MyThread2 extends Thread {

    MyData d = new MyData();

    MyThread2(MyData dat) {
        d = dat;
    }

    public void run() {
        d.display("WELCOME");
    }

}

class SyncDemo {

    public static void main(String[] args) {

        MyData data = new MyData();

        MyThread1 t1 = new MyThread1(data);

        MyThread2 t2 = new MyThread2(data);
        t1.start();
        t2.start();

    }
}