import java.io.*;
import java.net.*;
import java.security.spec.ECFieldF2m;

public class Client1 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
