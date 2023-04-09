class WhiteBoard {
    String text;
    int noOfStudent = 0;
    int count = 0;

    public void attendance() {
        noOfStudent++;
    }

    synchronized public void write(String t) {
        System.out.println("Teacher is Writing " + t);
        while (count != 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        text = t;
        count = noOfStudent;
        notifyAll();
    }

    synchronized public String read() {

        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        String t = text;
        count--;
        if (count == 0) {
            notify();
        }
        return t;
    }

}

class Teacher extends Thread {
    WhiteBoard wb;

    String notes[] = { "Java is language", "It is OOPs", "It is Platform Independent", "It supports Thread", "end" };

    Teacher(WhiteBoard w) {
        wb = w;
    }

    public void run() {
        for (int i = 0; i < notes.length; i++) {
            wb.write(notes[i]);
        }
    }

}

class Student extends Thread {
    String name;
    WhiteBoard wb;

    Student(String n, WhiteBoard w) {
        name = n;
        wb = w;
    }

    public void run() {
        String text;
        wb.attendance();
        do {
            text = wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        } while (!text.equals("end"));

    }

}

class StudentChallengeWhiteboard {

    public static void main(String[] args) {

        WhiteBoard w = new WhiteBoard();
        Teacher t = new Teacher(w);

        Student s1 = new Student("1 .Akugi", w);
        // Student s2 = new Student("Akainu", w);
        // Student s3 = new Student("Kizaru", w);
        // Student s4 = new Student("Fugitora", w);

        t.start();
        s1.start();
        // s2.start();
        // s3.start();
        // s4.start();

    }
}