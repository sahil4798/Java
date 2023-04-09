// class MyThread extends Thread {
//     public MyThread(String name) {
//         super(name);
//     }

//     public void run() {
//         int count = 1;
//         while (true) {
//             System.out.println(count++);
//         }
//     }

// }

// class ThreadClass2 {

//     public static void main(String[] args) {

//         MyThread t = new MyThread("Thread 1");

//         t.setDaemon(true);
//         t.start();

//         // try {
//         // Thread.sleep(1000);
//         // } catch (Exception e) {
//         // }

//         // Thread mainThread = new Thread(new ThreadClass2());
//         Thread mainThread = Thread.currentThread();
//         try {
//             mainThread.join();
//         } catch (Exception e) {

//         }

//     }
// }

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++ + "MyThread");
        }
    }

}

class ThreadClass2 {

    public static void main(String[] args) {

        MyThread t = new MyThread("Thread 1");

        t.start();

        int count = 1;

        while (true) {
            System.out.println(count++ + "Main");
            // Thread.yield();
        }
    }
}
