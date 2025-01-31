import java.awt.*;

public class awt_basic extends Frame {

    awt_basic() {

        Button b = new Button("Click me!!");
        b.setBounds(100, 100, 80, 30);

        this.setSize(300, 300);
        this.setTitle("Basic AWT.");
        this.setVisible(true);
        this.setLayout(null);
        this.add(b);

    }
    public static void main(String[] args) {
        new awt_basic();
    }
}
