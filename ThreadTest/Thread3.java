import java.io.*;

class Threadclass extends Thread {

    Threadclass (String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}

public class Thread3 extends Thread {
    public static void main(String[] args) {
        Threadclass t1 = new Threadclass("First");
        Threadclass t2 = new Threadclass("Second");

        System.out.println("first name : " + t1.getName());
        System.out.println("Second name : " + t2.getName());

        t1.start();
        t2.start();
    }
}
