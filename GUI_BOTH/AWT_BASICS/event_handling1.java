import java.awt.*;
import java.awt.event.*;

public class event_handling1 extends Frame implements ActionListener {
    TextField tf;
    
    event_handling1() {
        
        tf = new TextField();
        tf.setBounds(60, 50, 150, 25);
        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(this);

        this.setLayout(null);
        this.add(b); this.add(tf);
        this.setSize(400, 400);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        tf.setText("Hola John Cena.");
    }
    public static void main(String[] args) {
        new event_handling1();
    }
}
