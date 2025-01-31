import java.util.*;

public class DateAndTime {
    public static void main(String args[]) {
        Date d1 = new Date();
        System.out.println("Current date : " + d1);
        System.out.println("toString : " + d1.toString());
        Date d2 = new Date(2004353531345L);
        System.out.println("Using millis : " + d2);
        System.out.println("d1 comes before d2 : " + d1.before(d2));
        int c = d2.compareTo(d1);
        System.out.println(c);

        System.out.println(d1.getTime());
    }
}
