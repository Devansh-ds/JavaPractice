import java.awt.*;
import java.awt.event.*;

public class toolkit2 {
    public static void main(String[] args) {
        Frame f = new Frame();
        Button b = new Button("beep1");
        b.setBounds(50, 100, 100, 50);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Toolkit.getDefaultToolkit().beep();
            }
        });
    }
}
