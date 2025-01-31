import java.util.*;

public class enum3 {

    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY
    }
    public static void main(String[] args) {
        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.MONDAY,"wtf");
        map.put(Days.TUESDAY, "4edf");
        map.put(Days.WEDNESDAY, "sfdsf");

        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}
