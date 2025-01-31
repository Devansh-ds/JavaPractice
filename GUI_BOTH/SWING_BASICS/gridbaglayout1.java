import javax.swing.*;
import java.awt.*;

public class gridbaglayout1 {
    gridbaglayout1() {
        JFrame f = new JFrame();
        f.setSize(500, 500);

        GridBagConstraints gbc = new GridBagConstraints();
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(b1, gbc); 

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(b2, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(b3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(b4, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(b5, gbc);

        f.add(panel);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new gridbaglayout1();
    }
}
