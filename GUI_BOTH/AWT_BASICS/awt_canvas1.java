import java.awt.*;

public class awt_canvas1 {
    
    public awt_canvas1() {
        Frame f = new Frame("canvas example");
        f.add(new MyCanvas());

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new awt_canvas1();
    }
}
class MyCanvas extends Canvas {
    public MyCanvas() {
        setBackground(Color.GRAY);
        setSize(300, 200);
    }
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(75, 75, 150, 150);
    }
}
