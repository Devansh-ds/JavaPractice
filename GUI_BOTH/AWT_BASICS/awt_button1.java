import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class awt_button1 {
    
    Frame frame;
    Button b1, b2, b3;
    
    awt_button1() {

        frame = new Frame("to display frame");
        b1 = new Button();
        b2 = new Button("in constructor");
        b3 = new Button();
        b3.setLabel("using setLabel");

        frame.add(b1); frame.add(b2); frame.add(b3);
        // frame.setLayout(new FlowLayout());
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new awt_button1();
    }
}
