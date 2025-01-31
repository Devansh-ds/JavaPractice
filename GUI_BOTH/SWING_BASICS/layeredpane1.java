import javax.swing.*;
import java.awt.*;

public class layeredpane1 {
    layeredpane1() {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(null);

        JLayeredPane pane = f.getLayeredPane();

        JButton top = new JButton();
        top.setBackground(Color.WHITE);
        JButton middle = new JButton();
        middle.setBackground(Color.RED);
        JButton bottom = new JButton();
        bottom.setBackground(Color.BLUE);

        top.setBounds(20, 20, 60, 60);
        middle.setBounds(40, 40, 60, 60);
        bottom.setBounds(60, 60, 60, 60);

        pane.add(top, 3);
        pane.add(middle, 2);
        pane.add(bottom, 1);

        f.setVisible(true);
    }
    public static void main(String[] args) {
        new layeredpane1();
    }
}
