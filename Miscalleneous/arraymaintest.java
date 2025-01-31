import java.util.*;
public class arraymaintest {
    public static void main(String[] args) {
        int[] a;
        
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
    }
}
