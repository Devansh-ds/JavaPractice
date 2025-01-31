import java.io.*;
import java.util.*;

class ThreadExample implements Runnable {
    String name;
    Thread thread;

    ThreadExample(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("A new thread " + thread + " is created");
        thread.start();
    }
    public void run() {
        try {
            for (int j = 1; j <= 5; j++) {
                System.out.println(name + " : " + j);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " thread is interrupted");
        }
        System.out.println(name + " thread exiting.");
    }
}
class ThreadExmaples {
    public static void main(String[] args) {
        new ThreadExample("1st");

        try {
            Thread.sleep(600); 
        } catch (InterruptedException e) {
            System.out.println("Bakchodi");
        }

        new ThreadExample("2nd");
        new ThreadExample("3rd");
        
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            System.out.println("Interruption in main threaad");
        }
        System.out.println("Exiting from the main thread");
    }
}