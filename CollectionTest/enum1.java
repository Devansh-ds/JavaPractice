import java.util.*;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class enum1 {
    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
        Set<days> set2 = EnumSet.noneOf(days.class);
        Iterator<days> itr = set2.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(set2);
    }
}
