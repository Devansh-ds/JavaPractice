import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "aaa");
        map.put(2, "aba");
        map.put(3, "aab");
        map.put(4, "baa");
        map.put(5, "bab");

        System.out.println("Iterating hashMap : ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(6, "hi");
        map2.putAll(map);
        System.out.println("Iterating other map");
        for (Map.Entry m : map2.entrySet()) {
            System.out.println(m.getKey() +" : " + m.getValue());
        }
        map2.remove(4, "baa");
        map2.replace(3, "aab", "cena");
        System.out.println(map2);
        System.out.println("dont knwo : ");
        map2.replaceAll((k, v) -> "ashish");
        System.out.println(map2);
    }
}
