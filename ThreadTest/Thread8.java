import java.lang.*;

class ThreadNew extends Thread {
    
    ThreadNew(String name, ThreadGroup tgrp) {
        super(tgrp, name);
        start();
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " is finished.");
    }
}

public class Thread8 {
    public static void main(String args[]) {
        ThreadGroup tg = new ThreadGroup("The parent group");
        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew t1 = new ThreadNew("first", tg);
        System.out.println("starting the first");
        ThreadNew t2 = new ThreadNew("second", tg);
        System.out.println("Starting the second");

        System.out.println("The parent of " + tg.getName() + " is " + tg.getParent().getName());
        System.out.println("The parent of " + tg1.getName() + " is " + tg1.getParent().getName());

        tg.interrupt();
    }  
}
