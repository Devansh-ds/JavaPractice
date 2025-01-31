import javax.swing.*;

public class jslider1 {
    public static void main(String[] args) {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // JPanel panel = new JPanel();
        // panel.add(slider);
        // panel.setBounds(50, 50, 100, 30);

        JFrame frame = new JFrame();
        // frame.setLayout(null);
        frame.setSize(500, 500);
        frame.add(slider);
        frame.setVisible(true);
        frame.pack();


    }
}
