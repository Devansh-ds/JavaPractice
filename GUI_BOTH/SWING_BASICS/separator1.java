import javax.swing.*;

public class separator1 {
    JMenu menu;
    JMenuItem i1, i2;
    separator1() {
        JFrame f = new JFrame();
        f.setLayout(null);
        f.setSize(500, 500);

        JMenuBar mb = new JMenuBar();
        menu = new JMenu("MENU");
        i1 = new JMenuItem("item 1");
        i2 = new JMenuItem("item 2");
        menu.add(i1);
        menu.addSeparator();
        menu.add(i2);
        menu.addSeparator();
        menu.addSeparator();

        mb.add(menu);

        f.setJMenuBar(mb);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new separator1();
    }
}
