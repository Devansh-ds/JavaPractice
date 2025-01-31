import java.awt.*;
import java.awt.event.*;

public class MouseListenerTest2 implements MouseListener {
    Frame f;
    MouseListenerTest2() {
        f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);
        f.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);

    }
    public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
    public void mousePressed(MouseEvent e) {}  
    public void mouseReleased(MouseEvent e) {}  
    public static void main(String[] args) {
        new MouseListenerTest2();
    }
}
