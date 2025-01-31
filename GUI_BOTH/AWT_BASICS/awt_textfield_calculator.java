import java.awt.*;
import java.awt.event.*;

public class awt_textfield_calculator implements ActionListener {
    
    TextField t1, t2, t3;
    Button b1, b2;

    awt_textfield_calculator() {

        Frame f = new Frame();
        f.setLayout(null);
        f.setSize(600, 600);

        t1 = new TextField();
        t1.setBounds(50, 100, 100, 30);
        t2 = new TextField();
        t2.setBounds(200, 100, 100, 30);
        t3 = new TextField();
        t3.setBounds(100, 200, 100, 30);
        t3.setEditable(false);

        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b1.setBounds(50, 400, 100, 50);
        b2.setBounds(200, 400, 100, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(t1); f.add(t2); f.add(t3);
        f.add(b1); f.add(b2);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;

        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        }
        String result = String.valueOf(c);
        t3.setText(result);
    }

    public void main(String args[]) {
        new awt_textfield_calculator();
    }

}
