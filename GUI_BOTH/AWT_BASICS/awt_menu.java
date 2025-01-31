import java.awt.*;

public class awt_menu {
    
    awt_menu() {
        
        Frame f = new Frame("example!!");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(500, 500);

        MenuBar mb = new MenuBar();
        Menu menu = new Menu("Menu");
        Menu submenu = new Menu("SubMenu");

        MenuItem i1=new MenuItem("Item 1");  
        MenuItem i2=new MenuItem("Item 2");  
        MenuItem i3=new MenuItem("Item 3");  
        MenuItem i4=new MenuItem("Item 4");  
        MenuItem i5=new MenuItem("Item 5");  

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        mb.add(menu);
        menu.add(submenu);

        f.setMenuBar(mb);

    }

    public static void main(String[] args) {
        new awt_menu();
    }
}
