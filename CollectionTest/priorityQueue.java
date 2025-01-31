import java.util.*;

public class priorityQueue {
    public static void main(String args[]) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        System.out.println(q.peek());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(23);
        q.add(5);
        System.out.println(q);
    }
}
