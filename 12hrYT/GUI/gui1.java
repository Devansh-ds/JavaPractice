import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class gui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("This is the title.");
        // On pressing the cross button it only hides,
        // instead of closing the program
        // so, we changed below setting.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // DO_NOTHING_ON _CLOSE - it wont do anythong.
        // HIDE_ON_CLOSE - It hides gui but not close the program.
        // EXIT_ON_CLOSE - It closes the program.
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setResizable(false); // It prevents changing the size of the frame.

        ImageIcon image = new ImageIcon("pic.jpg");
        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(new Color(29, 49, 49));
        // getContentPane() gets the access of Panel
        // second one is method that changes background color.
        // Color is a class used to get colour
        // new Color(0,0,0) {to 255} is used to set own RGB value if predefined macro is not used.

    }
}