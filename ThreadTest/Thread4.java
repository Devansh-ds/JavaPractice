import java.lang.*;

public class Thread4 extends Thread {

    public void run() {
        System.out.println("Thread running. : " + Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        Thread4 t1 = new Thread4();
        Thread4 t2 = new Thread4();
        Thread4 t3 = new Thread4();
        t1.setName("First");
        t2.setName("Second");
        System.out.println("T1 priority : " + t1.getPriority());
        System.out.println("T2 priority : " + t2.getPriority());
        System.out.println("T3 priority : " + t3.getPriority());
        
        t1.setPriority(4);
        t2.setPriority(9);
        System.out.println("T1 priority : " + t1.getPriority());
        System.out.println("T2 priority : " + t2.getPriority());
        t1.start();
        t2.start();
    }
}
