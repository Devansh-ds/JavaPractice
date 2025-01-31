import java.io.*;
import java.util.*;

public class Thread1 implements Runnable {
    public void run() {
        System.out.println("Thread running.");
    }
    public static void main(String[] args) {
        Runnable g1 = new Thread1();
        Thread t1 = new Thread(g1, "John Cena");
        t1.start();
        String s = t1.getName();
        System.out.println(s);
    }
}
