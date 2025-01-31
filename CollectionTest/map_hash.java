import java.util.*;

public class map_hash {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "amit");
        map.put(7, "naman");
        map.put(3, "ajay");
        map.put(5, "john");

        System.out.println(map);
        for(Map.Entry obj : map.entrySet()) {
            System.out.println(obj.getKey() + " : " + obj.getValue());
        }
        System.out.println("NO Idea (-_-)");
        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
        .forEach(System.out :: println);
        System.out.println("Again no idea (-_-)");
        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(System.out :: println);
    }
}
