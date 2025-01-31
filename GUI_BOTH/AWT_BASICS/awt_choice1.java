import java.awt.*;

public class awt_choice1 {
    
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);

        Choice c = new Choice();
        c.setBounds(100, 100, 100, 50);
        c.add("Item 1");
        c.add("item 2");
        c.add("item 3");
        c.add("item 4");
        c.add("item 5");

        c.insert("inserted at 2", 2);

        f.add(c);

    }
}
