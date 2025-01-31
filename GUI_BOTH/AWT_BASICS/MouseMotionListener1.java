import java.awt.*;
import java.awt.event.*;

public class MouseMotionListener1 implements MouseMotionListener {
    Label l;
    Frame f;
    MouseMotionListener1() {
        f = new Frame();
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        f.addMouseMotionListener(this);

        l = new Label();
        l.setBounds(20, 40, 100, 30);
        f.add(l);        
    }
    public void mouseMoved(MouseEvent e) {
        l.setText("X : " + e.getX() + "Y : " + e.getY());
    }
    public void mouseDragged(MouseEvent e) {
        l.setText("X : " + e.getX() + "Y : " + e.getY());
        Graphics g = f.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }
    public static void main(String[] args) {
        new MouseMotionListener1();
    }
}
