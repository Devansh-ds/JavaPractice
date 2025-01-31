import java.lang.ThreadGroup;

public class Thread7 implements Runnable {
    static int i = 1;
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : " + i);
        i++;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread7 obj = new Thread7();
        ThreadGroup tg = new ThreadGroup("Parent_thread");

        Thread t1 = new Thread(tg, obj, "one");
        t1.start();
        Thread t2 = new Thread(tg, obj, "two");
        t2.start();
        Thread t3 = new Thread(tg, obj, "three");
        t3.start();
        System.out.println(tg.activeCount());
        System.out.println("Thread Group name : " + tg.getName());
        tg.list();

    }
}
