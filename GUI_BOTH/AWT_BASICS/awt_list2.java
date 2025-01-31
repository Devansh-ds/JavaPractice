import java.awt.*;
import java.awt.event.*;

public class awt_list2 {
    
    awt_list2() {

        Frame f = new Frame();
        Label label = new Label();
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(600, 600);

        label.setAlignment(Label.CENTER);
        label.setSize(500, 100);
        label.setText("fuck");

        Button b = new Button("show");
        b.setBounds(200, 150, 100, 50);

        final List l1 = new List(4, false);    
        l1.setBounds(100, 100, 70, 70);    
        l1.add("C");    
        l1.add("C++");    
        l1.add("Java");    
        l1.add("PHP");    
  
  
        final List l2=new List(4, true);    
        l2.setBounds(100, 200, 70, 70);    
        l2.add("Turbo C++");    
        l2.add("Spring");    
        l2.add("Hibernate");    
        l2.add("CodeIgniter");
        
        f.add(l1); f.add(l2); f.add(b); f.add(label);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "lang : " + l1.getSelectedItem();
                data += ", framework : ";
                for (String item : l2.getSelectedItems()) {
                    data += item + " ";
                }
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new awt_list2();
    }
}
