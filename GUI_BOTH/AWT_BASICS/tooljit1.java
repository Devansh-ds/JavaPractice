import java.awt.*;

public class tooljit1 {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();
        System.out.println("Screen resolution : " + t.getScreenResolution());
        Dimension d = t.getScreenSize();
        System.out.println("width : " + d.getWidth());
        System.out.println("height : " + d.getHeight());

    }
}
