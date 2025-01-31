import java.io.*;

class Person implements Serializable {
    int id;
    String name;
    static String nonserial = "what?";
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Student2 extends Person {
    String course;
    int fee;
    public Student2(int id, String name, String course, int fee) {
        super(id, name);
        this.course = course;
        this.fee = fee;
    }
}
public class Serialization2 {
    public static void main(String[] args) {
        try {
            Student2 s1 = new Student2(52, "Devansh", "Enginnering", 180000);
            String filename = "C:\\Users\\Devan\\javapractice\\SeDe2.txt";
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("yay");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
