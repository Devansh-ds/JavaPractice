class test1 {
    static int a = 4;
    static int b;

    static void meth() {
        System.out.println(a+ " " + b);
        test1.idk2();
    }
    static {
        System.out.println("Inside static block");
        b = a*4;
    }
    void idk(test1 obs) {
        test1.meth(test1 obs);
    }
    void idk2() {
        System.out.println("yes");
    }
}

class staticmeth {
    public static void main(String args[]) {
        test1 ob = new test1();
        ob.idk(ob);
        System.out.println(test1.b);
    }
}