class A {
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("I and j");
    }
}
class B extends A {
    int k;
    B(int a, int b, int c) {
        //k = a;
        super(b, c);
        k = a;
    }
    void show() {
        super.show();
        System.out.println("K ");
    }
}
class supermethod {
    public static void main (String args[]) {
        B ob = new B(1, 3, 5);
        ob.show();
    }
}

