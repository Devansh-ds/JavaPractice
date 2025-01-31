import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cardlayout1 implements ActionListener {
    JButton b1, b2, b3;
    CardLayout card;
    Container cont;

    cardlayout1() {
        JFrame f = new JFrame();
        f.setSize(500, 500);

        cont = f.getContentPane();
        card = new CardLayout();
        cont.setLayout(card);

        b1 = new JButton("first");
        b2 = new JButton("second");
        b3 = new JButton("third");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        cont.add("a", b1);
        cont.add("b", b2);
        cont.add("c", b3);

        f.setVisible(true);
    }
    public static void main(String[] args) {
        new cardlayout1();
    }
    public void actionPerformed(ActionEvent e) {
        card.next(cont);
    }

}
