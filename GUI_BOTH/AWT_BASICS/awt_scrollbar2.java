import java.awt.*;
import java.awt.event.*;

public class awt_scrollbar2 {
    awt_scrollbar2() {
        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);

        Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(300, 80);

        Scrollbar s = new Scrollbar();
        s.setBounds(100, 100, 100, 100);

        f.add(s); f.add(label);
        s.setOrientation(1);
        s.setMinimum(50);
        s.setMaximum(100);
        s.setValue(80);

        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical scrollbar : " + s.getValue());
            }
        });
    }
    public static void main(String[] args) {
        new awt_scrollbar2();
    }
}
