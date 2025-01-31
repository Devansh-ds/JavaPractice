import javax.swing.*;
import java.awt.*;

public class separator2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        // f.setLayout(new GridLayout(0, 1));
        JLabel l1 = new JLabel("above");
        JLabel l2 = new JLabel("below");
        f.add(l1);
        JSeparator sep = new JSeparator();
        f.add(sep);
        f.add(l2);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
