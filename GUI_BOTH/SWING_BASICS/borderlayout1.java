import javax.swing.*;
import java.awt.*;

public class borderlayout1 {
    borderlayout1() {
        JFrame f = new JFrame();

        JButton b1 = new JButton("NORTH"); // the button will be labeled as NORTH   
        JButton b2 = new JButton("SOUTH"); // the button will be labeled as SOUTH  
        JButton b3 = new JButton("EAST"); // the button will be labeled as EAST  
        JButton b4 = new JButton("WEST"); // the button will be labeled as WEST  
        JButton b5 = new JButton("CENTER");

        f.setLayout(new BorderLayout(100, 50));
        // b4.setBounds(100, 100, 300, 300);

        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);

        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new borderlayout1();
    }
}
