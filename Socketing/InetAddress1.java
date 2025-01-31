import java.net.*;

public class InetAddress1 {
    public static void main(String args[]) throws UnknownHostException{
        InetAddress address = InetAddress.getByName("Devansh");
        System.out.println("toString : " + address);

        String hostname = address.getHostName();
        System.out.println("Host name : " + hostname);
        
        String hostadd = address.getHostAddress();
        System.out.println("Host address : " + hostadd);
    }
}
