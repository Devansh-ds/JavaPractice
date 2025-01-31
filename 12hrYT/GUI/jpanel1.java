import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class jpanel1 {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("star.jpg");

        JLabel label = new JLabel();
        label.setText("hello");
        // label.setIcon(image);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        label.setBounds(0, 0, 75, 75);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel redPanel = new JPanel(); // JPanel is a container that holds other component
        redPanel.setBackground(Color.RED);  // sets background colour of the panel
        redPanel.setBounds(0, 0, 250, 250); // to position the panel as frame.layout is null

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        // greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);
        
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }    
}
