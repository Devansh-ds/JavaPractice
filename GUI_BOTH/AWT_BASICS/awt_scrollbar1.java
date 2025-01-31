import java.awt.*;

public class awt_scrollbar1 {
    awt_scrollbar1() {
        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);

        Scrollbar s = new Scrollbar();
        s.setBounds(100, 100, 50, 100);
        f.add(s);
    }
    public static void main(String[] args) {
        new awt_scrollbar1();
    }
}
