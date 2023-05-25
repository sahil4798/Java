import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import javax.xml.transform.Source;

class Producer extends Thread {
    OutputStream os;

    Producer(OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 1;
        try {
            while (true) {
                os.write(count);
                os.flush();
                System.out.println("Procuder : " + count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    Consumer(InputStream i) {
        is = i;
    }

    public void run() {
        int x;
        try {
            while (true) {
                x = is.read();
                System.out.println("Consumer : " + x);
                System.out.flush();
                Thread.sleep(10);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class PippedStream {

    public static void main(String[] args) throws Exception {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();
        pos.connect(pis);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();

    }
}