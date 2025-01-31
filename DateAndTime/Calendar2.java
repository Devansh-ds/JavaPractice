import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public class Calendar2 {
    public static void main(String args[]) {
        Calendar c = Calendar.getInstance();
        System.out.println("The current date : " + c.getTime());

        c.add(Calendar.DAY_OF_WEEK, 10);
        System.out.println("AFTER 10 days : " + c.getTime());

        System.out.println(c.get(Calendar.WEEK_OF_MONTH));
    }
}
