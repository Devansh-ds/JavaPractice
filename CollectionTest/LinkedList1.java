import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("first");
        l1.add("second");
        l1.add("third");
        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("1st");
        l2.add("2nd");
        l2.add("3rd");
        l1.addAll(l2);
        System.out.println(l1);
        l1.addAll(1, l2);
        System.out.println(l1);

        l1.addFirst(l2.getLast());
        System.out.println(l1);

        l1.removeLastOccurrence("1st");
        System.out.println(l1);

        Iterator i = l1.descendingIterator();
        while(i.hasNext()) {
            System.out.print(i.next() + ", ");
        }
    }
}
