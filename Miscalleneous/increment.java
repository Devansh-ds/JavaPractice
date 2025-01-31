public class increment {
    
    public static void main (String[] args) {
        increment o = new increment();
        o.go();
    }

    void go() {

        int y = 7;
        
        System.out.println(y++);
        System.out.println("++y : " + ++y);
    }
}
