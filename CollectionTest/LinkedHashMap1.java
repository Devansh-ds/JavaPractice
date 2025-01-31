import java.util.*;

public class LinkedHashMap1 {
    public static void main (String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(3, "john");
        hm.put(4, "aman");
        hm.put(1, "hello");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        System.out.println("Keys : " + hm.keySet());
        System.out.println("Values : " + hm.values());
        hm.remove(4);
        System.out.println("key-value : " + hm.entrySet());

    }
}
