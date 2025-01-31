import java.io.*;

public class Deserialization2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("SeDe2.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student2 s = (Student2) in.readObject();
            System.out.println(s.id + " : " + s.name + " : " + s.course + " : " + s.fee);
            System.out.println(s.nonserial);
            in.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
