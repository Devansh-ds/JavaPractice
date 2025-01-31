import java.awt.*;
import java.awt.event.*;

public class awt_button2 implements ActionListener {
    Button b;
    Button b2;
    TextField tf;
    awt_button2() {
        Button b = new Button("first");
        Button b2 = new Button("seocnd");
        b2.addActionListener(this);
        b.addActionListener(this); 

        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);

        tf = new TextField();
        tf.setBounds(100, 50, 100, 40);

        b2.setBounds(100, 420, 100, 50);
        b.setBounds(100, 300, 100, 50);
        f.add(b); f.add(tf); f.add(b2);
    }
    public static void main(String[] args) {
        new awt_button2();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            tf.setText("button 1");
        } else {
            tf.setText("button 2");
        }
    }
}
