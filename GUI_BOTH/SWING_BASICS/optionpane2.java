import javax.swing.*;
import java.awt.event.*;

public class optionpane2 extends WindowAdapter {
    JFrame f;
    optionpane2() {
        f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(null);
        f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f, "Sure?");
        if (a == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args) {
        new optionpane2();
    }
}
