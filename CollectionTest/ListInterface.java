import java.util.*;

public class ListInterface {
    public static void main(String args[]) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(11);
        l1.add(12);
        l1.add(13);
        System.out.println(l1);
        l1.add(1, 15);
        System.out.println(l1);

        l1.remove(0);
        System.out.println(l1);
        System.out.println(l1.get(0));
        System.out.println(l1);
        l1.set(0, 12);
        System.out.println(l1);
        for (int i : l1) {
            System.out.println(i);
        }
    }
}
