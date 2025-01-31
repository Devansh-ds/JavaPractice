import java.awt.*;
import java.awt.event.*;

public class awt_checkgrp1 {
    
    awt_checkgrp1() {

        Frame f = new Frame();
        CheckboxGroup cbg = new CheckboxGroup();
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(null);

        Checkbox c1 = new Checkbox("C++", cbg, false);
        Checkbox c2 = new Checkbox("JAVA", cbg, true);
        c1.setBounds(100, 100, 50, 50);
        c2.setBounds(100, 150, 50, 50);

        Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        label.setText("Java checked");

        f.add(c1); f.add(c2); f.add(label);

        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ checked");
            } 
        });
        c2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("JAVA checked");
            }
        });


    }

    public static void main(String[] args) {
        new awt_checkgrp1();
    }
}
