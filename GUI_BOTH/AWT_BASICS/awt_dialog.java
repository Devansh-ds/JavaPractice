import java.awt.*;
import java.awt.event.*;

public class awt_dialog {
    private static Dialog d;
    awt_dialog() {
        Frame f = new Frame();
        d = new Dialog(f,"dialog box", true);
        d.setLayout(new FlowLayout());
        Button b = new Button("ok");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
            }
        });
        d.add(new Label("click buuton :"));
        d.add(b);
        d.setSize(500, 500);
        d.setVisible(true);
    }
    public static void main(String[] args) {
        new awt_dialog();
    }
}
