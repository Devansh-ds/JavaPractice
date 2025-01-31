import java.awt.*;
import java.awt.event.*;

public class awt_popupmenu {
    awt_popupmenu() {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(null);

        PopupMenu pm = new PopupMenu();
        MenuItem cut = new MenuItem("cut");
        cut.setActionCommand("CUT");
        MenuItem copy = new MenuItem("copy");
        copy.setActionCommand("COPY");
        MenuItem paste = new MenuItem("paste");
        paste.setActionCommand("PASTE");

        pm.add(cut); pm.add(copy); pm.add(paste);

        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pm.show(f, e.getX(), e.getY());
            }
        });
        f.add(pm);
    }
    public static void main(String[] args) {
        new awt_popupmenu();
    }
}
