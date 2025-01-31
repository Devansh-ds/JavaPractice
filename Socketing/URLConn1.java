import java.io.*;
import java.net.*;

public class URLConn1 {
    public static void main(Stirng[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            while((i = stream.read())!= -1) {
                System.out.println((char) i);
            }
        } catch (Excception e) {
            System.out.println(e);
        }
    }
}
