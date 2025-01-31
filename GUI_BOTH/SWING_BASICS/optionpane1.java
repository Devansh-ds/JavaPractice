import javax.swing.*;

public class optionpane1 {
    JFrame f;
    optionpane1() {
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Hello", "A box", JOptionPane.ERROR_MESSAGE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String name = JOptionPane.showInputDialog(f, "Enter name", "hi");
        System.out.println(name);
    }
    public static void main(String[] args) {
        new optionpane1();
    }
}