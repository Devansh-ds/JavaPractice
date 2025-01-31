import java.awt.*;

public class awt_checkbox1 {
    
    awt_checkbox1() {

        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(null);

        Checkbox cb1 = new Checkbox();
        cb1.setLabel("C++");
        cb1.setBounds(100, 100, 150, 50);

        Checkbox cb2 = new Checkbox("Java");
        cb2.setBounds(100, 150, 50, 150);
        cb2.setState(true);

        f.add(cb1); f.add(cb2);

    }
    public static void main(String[] args) {
        new awt_checkbox1();
    }
}
