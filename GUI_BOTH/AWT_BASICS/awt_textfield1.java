import java.awt.*;

public class awt_textfield1 {
    
    public static void main(String[] args) {

        Frame f = new Frame();
        TextField t1, t2;
        f.setLayout(null);

        t1 = new TextField("hello", 30);
        t2 = new TextField("holmiog");

        t1.setBounds(50, 100, 100, 30);
        t2.setBounds(50, 200, 100, 50);

        f.add(t1); f.add(t2);
        f.setSize(600, 600);
        f.setVisible(true);
    }
}
