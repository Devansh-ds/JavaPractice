import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class jlabel_ip implements ActionListener {
    JTextField tf; JLabel l; JButton b;

    jlabel_ip() {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);

        tf = new JTextField();
        tf.setBounds(100, 50, 200, 40);

        l = new JLabel();
        l.setBounds(100, 100, 100, 40);

        b = new JButton("Find IP");
        b.setBounds(100, 250, 80, 30);
        b.addActionListener(this);

        f.add(b);
        f.add(l);
        f.add(tf);
    }
    public void actionPerformed(ActionEvent e) {
        String ip;
        try {
            String host = tf.getText();
            ip = java.net.InetAddress.getByName(host).getHostAddress();
        } catch (Exception e2) {
            System.out.println(e2);
            ip = "fuck me";
        }
        tf.setText(ip);
    }
    public static void main(String[] args) {
        System.out.println("hi");
        new jlabel_ip();
        System.out.println("hi");
    }
}
