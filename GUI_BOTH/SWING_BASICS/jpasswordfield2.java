import java.awt.event.*;
import javax.swing.*;

public class jpasswordfield2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("login example");
        
        frame.setLayout(null);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(50, 80, 100, 30);
        JTextField tf = new JTextField();
        tf.setBounds(190, 80, 100, 30);

        JLabel l2 = new JLabel("Password :");
        l2.setBounds(50, 190, 100, 30);
        JPasswordField jp = new JPasswordField();
        jp.setBounds(190, 190, 100, 30);

        JLabel label = new JLabel();
        label.setBounds(50, 420, 300, 40);

        JButton b = new JButton("SHOW");
        b.setBounds(150, 350, 100, 40);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Usename : " + tf.getText();
                data += ", Password : " + new String(jp.getPassword());
                label.setText(data);
            }
        });

        frame.add(l1); frame.add(l2); frame.add(label);
        frame.add(tf); frame.add(jp); frame.add(b);
        frame.setVisible(true);

    }
}
