import java.awt.*;

public class awt_list1 {
    
    awt_list1() {

        Frame f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);

        List list = new List(5);
        list.setBounds(100, 100, 75, 55);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        f.add(list);
    }

    public static void main(String args[]) {
        new awt_list1();
    }
}