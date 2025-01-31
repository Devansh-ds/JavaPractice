import javax.swing.*;

public class jbutton1s {
    public static void main(String[] args) {
        JFrame frame = new JFrame("a frame");
        JButton b = new JButton("Click me");
        b.setBounds(50, 100, 100, 30);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(b);
        b.setFocusable(false);
    }
}
