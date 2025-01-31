import java.sql.Date;

public class DateSql1 {
    public static void main(String args[]) {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);

        String str = "2015-02-15";
        Date date2 = Date.valueOf(str);
        System.out.println(date2);

        Date date3 = new Date(millis);
        date3.setTime(1400403000);
        System.out.println(date3);
        
    }    
}
