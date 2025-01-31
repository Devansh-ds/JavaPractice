import java.awt.*;
import java.awt.event.*;

public class MouseListenerTest implements MouseListener {

    Label l;

    MouseListenerTest() {
        Frame f = new Frame();
        f.addMouseListener(this);
        l = new Label();
        l.setBounds(50, 50, 100, 100);

        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500,500);
        f.add(l);
    }
    public void mouseClicked(MouseEvent e) {
        l.setText("clicked");
    }
    public void mouseEntered(MouseEvent e) {
        l.setText("entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setText("exited");
    }
    public void mousePressed(MouseEvent e) {
        l.setTest("pressed");
    }
    public void mouseReleased(MouseEvent e) {
        l.setText("released");
    }

    public static void main(String[] args) {
        new MouseListenerTest();
    }
    
}
