import javax.swing.*;
import java.awt.*;

public class jtoolbar1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar tb = new JToolBar();
        tb.setRollover(false);
        
        JButton b = new JButton("file");
        tb.add(b);
        tb.addSeparator();
        JButton b2 = new JButton("edit");
        tb.add(b2);
        tb.add(new JComboBox(new String[] {"1", "2", "3"}));

        Container cp = f.getContentPane();
        cp.add(tb, BorderLayout.SOUTH);
        JTextArea area = new JTextArea();
        JScrollPane sp = new JScrollPane(area);
        cp.add(sp, BorderLayout.CENTER);
        
        f.setSize(500, 500);
        f.setVisible(true);

    }
}
