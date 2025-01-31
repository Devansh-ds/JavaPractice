import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Iterator itr = list.iterator();

        System.out.println("Using iterator :");
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println(list.set(1, 45));
        Collections.sort(list);
        System.out.println("printing arraylist :");
        System.out.println(list);
        System.out.println("size of list : " + list.size());
        
    }
}
