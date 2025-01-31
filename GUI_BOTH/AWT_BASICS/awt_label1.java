import java.awt.*;
import java.awt.event.*;

public class awt_label1 extends Frame implements ActionListener {
    TextField tf;
    Label l;
    Button b;

    awt_label1() {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);

        l = new Label();
        l.setBounds(50, 100, 250, 50);

        b = new Button("ip finder");
        b.setBounds(50, 200, 100, 50);
        b.addActionListener(this);

        add(tf); add(l); add(b);

        setSize(500, 500);
        setVisible(true);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is : " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String args[]) {
        new awt_label1();
    }
}
