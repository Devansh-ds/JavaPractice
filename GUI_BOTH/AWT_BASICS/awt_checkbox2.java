import java.awt.*;
import java.awt.event.*;

public class awt_checkbox2 implements ItemListener {

    Label label;
    Checkbox c1, c2;
    
    awt_checkbox2() {

        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);

        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        label.setText("Java : checked");

        c1 = new Checkbox("C++");
        c2 = new Checkbox("JAVA");
        c2.setState(true);
        c1.setBounds(100, 100, 50, 50);
        c2.setBounds(100, 150, 50, 50);

        f.add(c1);
        f.add(c2);
        f.add(label);

        c1.addItemListener(this);
        c2.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            label.setText("C++ : " + (e.getStateChange() == 1? "checked" : "unchecked"));
        } else if (e.getSource() == c2) {
            label.setText("JAVA : " + (e.getStateChange() == 1? "checked" : "unchecked"));
        }
    }
    public static void main(String[] args) {
        new awt_checkbox2();
    }
}
