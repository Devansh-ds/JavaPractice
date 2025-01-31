import javax.swing.*;

public class jlabel1 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("fish.jpg");

        JFrame f = new JFrame("label example");
        JLabel l1, l2;
        l1 = new JLabel("first label");
        l2 = new JLabel(icon);
        l1.setBounds(50, 50, 100, 40);
        l2.setBounds(50, 150, 100, 40);
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500, 500);
        f.add(l1); f.add(l2);
    }
}
