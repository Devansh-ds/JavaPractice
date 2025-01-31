import javax.swing.*;

public class jpasswordfield1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPasswordField pass = new JPasswordField(5);
        JLabel label = new JLabel("Password");

        label.setBounds(50, 100, 100, 40);
        pass.setBounds(200, 100, 100, 40);

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.add(label); frame.add(pass);

    }
}
