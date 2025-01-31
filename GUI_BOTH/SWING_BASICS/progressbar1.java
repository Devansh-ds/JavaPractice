import javax.swing.*;

public class progressbar1 {
    progressbar1() {
        JFrame f = new JFrame();
        f.setLayout(null);
        f.setSize(500, 500);
        JProgressBar jp = new JProgressBar(0, 20000);
        jp.setBounds(100, 100, 200, 40);
        jp.setValue(30);
        jp.setOrientation(1);
        jp.setStringPainted(true);
        f.add(jp);
        f.setVisible(true);

        int i = 0;
        while (i <= 20000) {
            jp.setValue(i);
            i += 20;
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        new progressbar1();
    }
}
