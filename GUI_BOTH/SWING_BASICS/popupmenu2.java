import java.awt.event.*;
import javax.swing.*;

public class popupmenu2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jmenu example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        mb.add(menu);

        JMenuItem item = new JMenuItem("Open", KeyEvent.VK_N);
        menu.add(item);

        JCheckBoxMenuItem ci = new JCheckBoxMenuItem("options");
        ci.setMnemonic(KeyEvent.VK_S);
        menu.add(ci);

        ci.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AbstractButton b = (AbstractButton) e.getSource();
                String str;
                if (b.getModel().isSelected()) {
                    str = "Value-1";
                } else {
                    str = "Value_2";
                }
                b.setText(str);
            }
        });
        frame.setJMenuBar(mb);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
