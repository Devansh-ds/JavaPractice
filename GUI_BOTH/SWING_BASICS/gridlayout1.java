import javax.swing.*;
import java.awt.*;

public class gridlayout1 {
    gridlayout1() {
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(3, 4, 15, 15));

        JButton b1=new JButton("1");    
        JButton b2=new JButton("2");    
        JButton b3=new JButton("3");    
        JButton b4=new JButton("4");    
        JButton b5=new JButton("5");    
        JButton b6=new JButton("6");    
        JButton b7=new JButton("7");    
        JButton b8=new JButton("8");    
        JButton b9=new JButton("9");
        JButton b10 = new JButton("10");
        JButton b11 = new JButton("11");
        JButton b12 = new JButton("12");


        f.add(b1); f.add(b2); f.add(b3); f.add(b4);
        f.add(b5); f.add(b6); f.add(b7); f.add(b8);
        f.add(b9); f.add(b10); f.add(b11); f.add(b12);

        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new gridlayout1();
    }
}
