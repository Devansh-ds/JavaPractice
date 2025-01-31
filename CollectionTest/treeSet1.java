import java.util.*;

public class treeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(4);
        set.add(30);
        set.add(40);
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        Iterator des = set.descendingIterator();
        while (des.hasNext()) {
            System.out.println(des.next());
        }
        System.out.println("Lowest value : " + set.first());
        System.out.println("Highest value : " + set.last());

        System.out.println("toString : " + set);
        System.out.println("headSet : " + set.headSet(20, true));
        System.out.println("tailSet : " + set.tailSet(20, false));
        System.out.println("subSet : " + set.subSet(9, true, 30, true));

        
   
    }
}
