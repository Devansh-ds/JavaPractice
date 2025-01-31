import javax.swing.*;

public class ComboBox1 {
    JFrame f;
    ComboBox1() {
        f = new JFrame();
        f.setLayout(null);
        f.setSize(500, 500);
        String[] country = {"India","Aus","U.S.A","England","Newzealand"};
        
        JComboBox cb = new JComboBox(country);
        cb.setBounds(150, 150, 100, 40);
        cb.addItem(3);
        cb.setEditable(false);

        f.add(cb);
        f.setVisible(true);
    
    }
    public static void main(String[] args) {
        new ComboBox1();
    }
}
