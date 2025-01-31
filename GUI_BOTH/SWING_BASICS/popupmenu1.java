import java.awt.event.*;
import javax.swing.*;

public class popupmenu1 {
    popupmenu1() {
        JFrame f = new JFrame();
        f.setLayout(null);
        f.setSize(500, 500);
        
        JPopupMenu pm = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        pm.add(cut); pm.add(copy); pm.add(paste);

        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pm.show(f, e.getX(), e.getY());
            }
        }); 
        f.add(pm);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new popupmenu1();
    }
}
