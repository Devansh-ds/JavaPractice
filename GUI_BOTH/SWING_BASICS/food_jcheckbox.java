import java.awt.event.*;
import javax.swing.*;

public class food_jcheckbox implements ActionListener {
    JLabel l;
    JCheckBox c1, c2, c3;
    JButton b;
    JFrame frame;
    food_jcheckbox() {
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(null);

        l = new JLabel("food ordering system");
        l.setBounds(75, 75, 200, 50);

        c1 = new JCheckBox("Pizza @ 100");
        c2 = new JCheckBox("Burger @ 30");
        c3 = new JCheckBox("Tea @ 10");

        c1.setBounds(100, 150, 100, 30);
        c2.setBounds(100, 200, 100, 30);
        c3.setBounds(100, 250, 100, 30);
        

        b = new JButton("Order");
        b.setBounds(100, 400, 100, 30);
        b.addActionListener(this);

        frame.add(l); frame.add(c1); frame.add(c2); frame.add(c3);
        frame.add(b);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        if(c1.isSelected()) {
            amount += 100;
            msg += "Pizza : 100\n";
        }
        if (c2.isSelected()) {
            amount += 30;
            msg += "Burger : 30\n";
        }
        if (c3.isSelected()) {
            amount += 10;
            msg += "Tea : 10\n";
        }
        msg += "---------------\n";
        JOptionPane.showMessageDialog(frame, msg + "Total : " + amount);
    }    
    public static void main(String[] args) {
        new food_jcheckbox();
    }
}
