
//// *****************Constructor-1*************
// class MyRun implements Runnable {
// public void run() {

// }
// }

// class ThreadClass {

// public static void main(String[] args) {
// Thread t = new Thread(new MyRun(), "My name");

// }
// }

// *****************Constructor-2*************
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        // setPriority(MAX_PRIORITY);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

class ThreadClass {

    public static void main(String[] args) {
        // Constructor-2
        MyThread t = new MyThread("Thread 1");

        //// Methods
        // System.out.println("Id :" + t.getId());
        // System.out.println("Name :" + t.getName());
        // t.setPriority(10);
        // System.out.println("Priority :" + t.getPriority());
        // t.start();
        // System.out.println("State :" + t.getState());
        // System.out.println("IsAlive :" + t.isAlive());

        t.start();
        t.interrupt();
    }
}
