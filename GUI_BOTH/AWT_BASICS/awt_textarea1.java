import java.awt.*;

public class awt_textarea1 {
    
    awt_textarea1() {

        Frame f = new Frame();
        TextArea area = new TextArea();
        area.setBounds(50, 50, 100, 100);
        
        f.add(area);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new awt_textarea1();
    }
}
