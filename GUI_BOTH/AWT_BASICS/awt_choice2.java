import java.awt.*;
import java.awt.event.*;

public class awt_choice2 {

    awt_choice2() {

        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);

        Label label = new Label();
        label.setAlignment(label.CENTER);
        label.setSize(400, 100);

        Button b = new Button("Show");
        b.setBounds(300, 200, 100, 50);

        Choice c = new Choice();
        c.setBounds(100, 200, 100, 50);

        c.add("C");    
        c.add("C++");    
        c.add("Java");    
        c.add("PHP");    
        c.add("Android");

        f.add(c); f.add(label); f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Language : " + c.getItem(c.getSelectedIndex()));
            }
        });

    }

    public static void main(String[] args) {
        new awt_choice2();
    }
}
