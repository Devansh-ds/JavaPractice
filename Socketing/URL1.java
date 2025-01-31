import java.net.*;

public class URL1 {
    public static void main(String args[]) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            System.out.println("Protocol");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
