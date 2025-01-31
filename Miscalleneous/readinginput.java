import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class readinginput {
    public static void main(String args[]) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader console = new BufferedReader(reader);
            String name = console.readLine();
            System.out.println(name + " yay");
        }
        catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
