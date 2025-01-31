class MyThread extends Thread {
    public void run() {
        System.out.println("shut down task is completed.");
    }
}

public class Thread9 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MyThread());
        System.out.println("Now main sleeping...");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

