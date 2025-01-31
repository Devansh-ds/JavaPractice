import java.net.SocketTimeoutException;

public class stringtest {
    public static void main (String args[]) {
        String str1 = "Aman";
        String str2 = "AMAN";
        boolean check = str1.equals(str2);
        System.out.println(check);
        String sub = str1.substring(1, str1.length());
        System.out.println(sub);
        boolean check2 = str1.equalsIgnoreCase(str2);
        System.out.println(check2);

        String str3 = "Amash";
        System.out.println(str1.compareTo(str1));
    }
}
