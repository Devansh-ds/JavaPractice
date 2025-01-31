import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;

public class filechooser1 implements ActionListener {
    JFrame f;
    JButton b;
    filechooser1() {
        f = new JFrame();
        f.setLayout(null);
        f.setSize(500, 500);
        
        b = new JButton();
        b.setBounds(100, 50, 80, 30);
        b.addActionListener(this);
        

        f.add(b);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new filechooser1();
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            JFileChooser fc = new JFileChooser();

            fc.setCurrentDirectory(new File(".")); // sets path to project folder "."

            // int response = fc.showOpenDialog(null); // it selects and open a file
            int response = fc.showSaveDialog(null); // it creates and save a file
            if (response == JFileChooser.APPROVE_OPTION) {
                String dir = fc.getSelectedFile().getAbsolutePath();
                System.out.println(dir);
            }
        }
    }
}