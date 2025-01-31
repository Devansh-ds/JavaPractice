import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class spinner1 {
    JSpinner spinner;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(500, 500);

        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(250, 100);

        SpinnerModel value = new SpinnerNumberModel(5, 0, 10, 1);
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100, 100, 100, 50);
        frame.add(spinner); frame.add(label);

        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Value : " + ((JSpinner) e.getSource()).getValue());
            }
        });
        frame.setVisible(true);
    }
}
