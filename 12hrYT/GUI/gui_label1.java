import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;

public class gui_label1 {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("star.jpg");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 5); // to get border of different types and thickness.

        JFrame frame = new JFrame();
        frame.setVisible(true);
        // frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null); // now we have to manually place our labels

        JLabel label = new JLabel();
        label.setText("This is a testing text."); // It creates a label where we can display text, image or both.
        label.setIcon(image); // It adds the Image (both txt and image added at left side in centre by defualt)
        label.setHorizontalTextPosition(JLabel.CENTER); // LEFT, CENTER AND RIGHT. with respect to IconImage.
        label.setVerticalTextPosition(JLabel.TOP); // TOP, CENTER AND BOTTOM
        label.setForeground(Color.ORANGE); // to set colour of the text.
        label.setFont(new Font("MV Boli", Font.BOLD, 28)); // to style the txt. new Font("name of font", "plain/bold/italics", size) is the constructor.
        label.setIconTextGap(-10); // to set gap b/w text and image.
        // text alignment till used only works if there is an ImageIcon
        label.setBackground(Color.BLACK);  // set background colour
        label.setOpaque(true); // without it background color won't display.
        label.setBorder(border); // set border of the label
        label.setVerticalAlignment(JLabel.CENTER); // it aligns the whole content vertically.
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100, 50, 380, 380); // It positions the label,(x, y, width, height);
    

        frame.add(label); // It adds label component in our frame.
        frame.pack(); // It makes the label change size acc to size of label
        // always add label first before using pack()
    }
}