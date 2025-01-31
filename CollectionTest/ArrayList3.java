import java.util.*;
import java.io.*;

public class ArrayList3 {
    public static void main(String args[]) {
        long l1 = System.currentTimeMillis();

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("first");
        al1.add("second");
        al1.add("third");
        al1.add("fourth");
        al1.add("first");
        System.out.println("al1 : " + al1);

        for(int i = 1; i < 100000; i++) {
            for (int j = 1; j < 100000; j++) {
                int k = 4;
            }
        }

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("1st");
        al2.add("2nd");
        al2.add("3rd");
        System.out.println("al2 : " + al2);

        al1.addAll(al2);
        System.out.println("After adding al2 on al1 : " + al1);
        al1.addAll(1, al2);
        System.out.println("adding al2 at index 1 in al1 : " + al1);
        al1.removeAll(al2);
        System.out.println("removeAll : " + al1);

        al1.removeIf(str -> str.contains("first"));
        System.out.println("after conditional remove : " + al1);

        long l2 = System.currentTimeMillis();
        System.out.println((l2 - l1) / 1000);
    }
}
