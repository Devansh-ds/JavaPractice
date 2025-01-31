import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class arraytest {
    public static void main (String args[]) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader console = new BufferedReader(reader);
            String[] staff = {"John", "Smith", "Aman", "Vijay", "Paramjeet"};
            int staffsize = staff.length;
            print(staff, staffsize);

            System.out.println("Which element want to delete? (0-4) : ");
            String input = console.readLine();
            int pos = Integer.parseInt(input);

            for (int i = pos; i < staffsize - 1; i++) {
                staff[i] = staff[i + 1];
            }
            staffsize--;
            print(staff, staffsize);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
    public static void print(String[] s, int len) {
        for (int i = 0; i < len; i++) {
            System.out.println(i + " : " + s[i]);
        }
    }
}
