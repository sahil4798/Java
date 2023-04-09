import java.lang.*;

class Phone {
    public void call() {
        System.out.println("Phone is calling");
    }

    public void sms() {
        System.out.println("Phone is sms");
    }
}

interface ICamera {
    public void click();

    public void shoot();
}

interface IMusic {
    public void play();

    public void pause();
}

class SmartPhone extends Phone implements ICamera, IMusic {

    public void click() {
        System.out.println("SmartPhone Clicking Photo");
    }

    public void shoot() {
        System.out.println("SmartPhone Shooting Video");
    }

    public void play() {
        System.out.println("SmartPhone is playing Music");
    }

    public void pause() {
        System.out.println("SmartPhone is pausing Music");
    }

}

class InterfaceExample {

    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();
        s.call();
        s.sms();
        s.click();
        s.shoot();
        s.play();
        s.pause();

        // Phone s1 = s;
        // s1.call();
        // s1.sms();

        // ICamera s2 = s;
        // s2.click();
        // s2.shoot();

        // IMusic s3 = s;
        // s3.play();
        // s3.pause();

    }
}