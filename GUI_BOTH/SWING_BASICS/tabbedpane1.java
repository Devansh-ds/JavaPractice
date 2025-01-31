import javax.swing.*;
import java.awt.*;

public class tabbedpane1 {
    JFrame f;
    tabbedpane1() {
        f = new JFrame();
        f.setLayout(null);
        JTextArea area = new JTextArea(200, 200);
        JPanel p1 = new JPanel();
        p1.add(area);
        p1.setLayout(new GridLayout(1,1));
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("main", p1);
        tp.add("visit", p2);
        tp.add("help", p3);
        f.add(tp);
        f.setSize(500, 500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new tabbedpane1();
    }
}