class varargs2 {
    static void test(int a, int b,int ...v, double c) {
        System.out.println(a);
        System.out.println(b);
        for (int x : v) System.out.println(" :" + x);
        System.out.println(c);
    }
    public static void main(String args[]) {
        test(1,2,3,4,4,5,3.5);
    }    
}
