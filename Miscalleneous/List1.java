import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("banana");
        list.add("grapes");
    
    for (String fruit : list) {
        System.out.println(fruit);
    }
    System.out.println("List : " + list);
    String[] array = list.toArray(new String[list.size()]);
    System.out.println("Array : " + Arrays.toString(array));

    System.out.println("element at index 1 of list : " + list.get(1));
    list.set(1, "Dates");
    System.out.println("List : " + list);
    System.out.println();

    Collections.sort(list);
    System.out.println(list);

    List<Integer> numlist = new ArrayList<Integer>();
    numlist.add(12);
    numlist.add(1);
    numlist.add(4);
    numlist.add(5);

    System.out.println(numlist);
    Collections.sort(numlist);
    System.out.println(numlist);
}
}
