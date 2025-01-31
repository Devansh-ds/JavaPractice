import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(3);
        deque.add(5);
        deque.add(2);
        deque.add(1);
        deque.add(4);
        Iterator<Integer> itr = deque.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        Queue<Integer> q = Collections.asLifoQueue(deque);
        System.out.println(q);
    }
}
