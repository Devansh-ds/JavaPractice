import java.util.*;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(110,"Ravi");  
        hm.put(120,"Prateek");  
        hm.put(130, "Davesh");    
        hm.put(140, "Kamal");  
        hm.put(150, "Pawan");    
        System.out.println(hm);
        Iterator<Integer> itr = hm.keySet().iterator();
        while(itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println("roll no. : " + key + " name : " + hm.get(key));
        }
        hm.forEach((k, v) -> System.out.println("key : " + k + ", value : " + v));

    }
}
