import java.io.*;

public class Deserialization1 {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student) in.readObject();
            System.out.println(s.id + " : " + s.name);
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
