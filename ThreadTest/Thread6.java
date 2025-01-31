import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test implements Runnable {
    private String name;

    public Test(String name) {
        this.name = name;
    }
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println(Thread.currentThread().getName() + " Initialising time for task : " + name + " = " + ft.format(d));
                } else {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println(Thread.currentThread().getName() + " Execution time for task : " + name + " = " + ft.format(d));
                }
                Thread.sleep(1000);
            }
            System.out.println(name + " task completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thread6 {
    static final int MAX = 3;

    public static void main(String args[]) {
        Runnable r1 = new Test("task 1");
        Runnable r2 = new Test("task 2");
        Runnable r3 = new Test("task 3");
        Runnable r4 = new Test("task 4");
        Runnable r5 = new Test("task 5");

        ExecutorService pool = Executors.newFixedThreadPool(MAX);

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        pool.shutdown();
    }
}
