import java.io.FileReader;

public class File3 {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
