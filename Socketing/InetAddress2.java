import java.net.*;

public class InetAddress2 {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress a1 = InetAddress.getByName("write.geeksforgeeks.org");

        System.out.println("Add of Named hosts : " + a1);

        InetAddress arr[] = InetAddress.getAllByName("www.geeksforgeeks.org");
        System.out.println("Inet add of All");
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
