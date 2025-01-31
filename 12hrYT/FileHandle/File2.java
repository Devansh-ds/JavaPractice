import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String args[]) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Humpty Dumpty sat on a wall.\nRoses are red.\nvoilets are Blue.");
            writer.append("hey\n");
            writer.write("yo.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
