class outer {
    int ox = 5;

    void test() {
        Inner ob = new Inner();
        ob.display();
    }
    class Inner() {
        int ix = 3;
        
        void display() {
            System.out.println("outer : " + ox);
        }
    }
    void showin() {
        //System.out.println(ix);
    }
}
class nestedclass {
    public static void main (String args[]) {
        outer out = new outer();
        out.test();
    }
}