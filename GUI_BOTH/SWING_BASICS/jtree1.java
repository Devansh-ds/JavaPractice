import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class jtree1 {
    JFrame f;
    jtree1() {
        f = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");

        style.add(color); style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");
        color.add(red); color.add(blue); color.add(black);

        JTree jt = new JTree(style);
        jt.setBounds(50, 50, 100, 100);
        f.add(jt);
        f.setSize(500, 500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new jtree1();
    }
}
