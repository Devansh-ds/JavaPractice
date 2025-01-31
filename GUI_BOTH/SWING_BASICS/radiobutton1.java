import javax.swing.*;

public class radiobutton1 {
    JFrame f;
    radiobutton1() {
        f = new JFrame();
        f.setLayout(null);
        f.setSize(500, 500);
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        r1.setBounds(100, 100, 100, 20);
        r2.setBounds(100, 200, 100, 20);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);

        f.add(r1); f.add(r2);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new radiobutton1();
    }
}
