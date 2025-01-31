import javax.swing.*;

public class jtable1 {
    JFrame f;
    jtable1() {
        f = new JFrame();
        f.setLayout(null);
        String[][] rows = {{"101","Amit","670000"},    
                           {"102","Jai","780000"},    
                           {"101","Sachin","700000"}};
        String[] cols = {"ID", "NAME", "SALARY"};
        JTable jt = new JTable(rows, cols);
        jt.setBounds(100, 100, 300, 200);
        JScrollPane jsp = new JScrollPane(jt);
        jsp.setBounds(50, 50, 100, 100);
        f.add(jsp);
        f.setSize(500, 500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new jtable1();
    }
}
