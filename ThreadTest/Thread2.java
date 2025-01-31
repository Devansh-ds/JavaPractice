class ABC implements Runnable {

    public void run() {
        System.out.println("In abc");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread t1 inside thread t2 : " + Thread2.t1.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thread2 implements Runnable {
    public static Thread t1;
    public static Thread2 obj;
    public static void main(String args[]) {
        obj = new Thread2();
        t1 = new Thread(obj);
        System.out.println("State of thread T1 after spawning : " + t1.getState());
        t1.start();
        System.out.println("State of t1 after start() : " + t1.getState());
    }

    public void run() {
        ABC myobj = new ABC();
        Thread t2 = new Thread(myObj);
        System.out.println("State of t2 after spawning : " + t2.getState());
        t2.start();
        System.out.println("State of t2 after start : " + t2.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of t2 after sleep() : " + t2.getState());
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of t2 after comp exec : " + t2.getState());
    }
}
