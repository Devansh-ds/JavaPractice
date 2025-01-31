public class del extends Thread {
    public void run() {
        System.out.println("Thread name : " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]) {
        del t1 = new del();
        del t2 = new del();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
