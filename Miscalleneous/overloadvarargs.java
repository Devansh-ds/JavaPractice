class overloadvarargs {

    static void test1(int ...v) {
        for (int x : v) System.out.println(x);
        System.out.println();
    }

    static void test1(double ...v){
        for (double x : v) System.out.println(x);
        System.out.println();
    }
    static void test1(string a,int ...v) {
        for (int x : v) System.out.println(x);
        System.out.println(a);
        System.out.println();
    }
    public static void main(String args[]) {
        test(8.9,9);
    }
}
