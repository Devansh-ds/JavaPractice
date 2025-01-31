class test {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }
    int getc() {
        return c;
    }
}
class acesss {
    public static void main(String args[]) {
        test ob = new test();
        ob.a  = 10;
        ob.b = 20;
        //ob.c = 30;
        ob.setc(30);
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.getc());
    }
}