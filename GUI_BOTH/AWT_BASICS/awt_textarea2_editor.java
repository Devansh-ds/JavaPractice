import java.awt.*;
import java.awt.event.*;

public class awt_textarea2_editor implements ActionListener {
    
    Label l1, l2;
    Button b;
    TextArea area;

    awt_textarea2_editor() {

        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);

        l1 = new Label();
        l1.setBounds(50, 50, 100, 30);
        l2 = new Label();
        l2.setBounds(160, 50, 100, 30);

        b = new Button("Count words and letters");
        b.setBounds(200, 400, 200, 50);
        b.addActionListener(this);

        area = new TextArea();
        area.setBounds(50, 100, 200, 150);

        f.add(l1); f.add(l2); f.add(b); f.add(area);

    }

    public void actionPerformed(ActionEvent e) {
        String text = area.getText();
        String[] words = text.split("\\s+");
        l1.setText("Words : " + words.length);
        l2.setText("Characters : " + text.length());
    }

    public static void main(String[] args) {
        new awt_textarea2_editor();
    }
}
