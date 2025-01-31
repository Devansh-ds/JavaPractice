class overload {
    void test() {
        System.out.println("No Parameter");
    }
    /*void test(int a) {
        System.out.println("a is "+ a);
    }*/
    void test(int a, int b) {
        System.out.println("a is "+ a + " . B is " + b);
    }
    void test(double a) {
        System.out.println("double a is " + a);
        //return a*a;
    }
    void test(int a) {
        System.out.println("INside int a");
    }
}
class overloadingdemo {
    public static void main(String args[]) {
        overload ob = new overload();
        double result;

        ob.test();
        ob.test(3);
        ob.test(5,6);
        ob.test(8.0);
        //System.out.println("Result of double " + result);
    }
}
