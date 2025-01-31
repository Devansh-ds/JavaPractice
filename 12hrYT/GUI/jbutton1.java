import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class jbutton1 extends JFrame {
    
    JButton button;
    jbutton1() {

        ImageIcon image = new ImageIcon("star.jpg");

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(e -> System.out.println("hello")); 
        button.setText("a button!"); // writes at center of the button
        button.setFocusable(false); // to remove the annoying border around the text of button
        button.setIcon(image);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.add(button);

    }

    // only if implements ActionListener Interface
    // public void actionPerformed(ActionEvent e) {
    //     if (e.getSource() == button) {
    //         System.out.println("john cena.");
    //     }
    // }
}
