import java.awt.event.*;
import javax.swing.*;

public class menubar1 implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea area;
    menubar1() {
        f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(null);
        
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("SelectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("FIle");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut); edit.add(copy); edit.add(paste); edit.add(selectAll);
        mb.add(file); mb.add(edit); mb.add(help);

        area = new JTextArea(6, 6);
        area.setBounds(30, 30, 200, 200);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        f.add(area);
        f.add(mb);
        f.setJMenuBar(mb);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) area.cut();
        if (e.getSource() == copy) area.copy();
        if (e.getSource() == paste) area.paste();
        if (e.getSource() == selectAll) area.selectAll();
    }
    public static void main(String[] args) {
        new menubar1();
    }
}
