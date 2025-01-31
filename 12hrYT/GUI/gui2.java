import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class gui2 extends JFrame {
    
    gui2() {

        this.setTitle("This is the title.");
        // On pressing the cross button it only hides,
        // instead of closing the program
        // so, we changed below setting.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // DO_NOTHING_ON _CLOSE - it wont do anythong.
        // HIDE_ON_CLOSE - It hides gui but not close the program.
        // EXIT_ON_CLOSE - It closes the program.
        this.setSize(420, 420);
        this.setVisible(true);
        this.setResizable(false); // It prevents changing the size of the this.

        ImageIcon image = new ImageIcon("pic.jpg");
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(new Color(29, 49, 49));
        // getContentPane() gets the access of Panel
        // second one is method that changes background color.
        // Color is a class used to get colour
        // new Color(0,0,0) {to 255} is used to set own RGB value if predefined macro is not used.
    }
}
