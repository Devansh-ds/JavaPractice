import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File file = new File("text_message.txt");

        if(file.exists()) {
            System.out.println("exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            file.delete();
        } else {
            System.out.println("why?");
        }
    }
}
