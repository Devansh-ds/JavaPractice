class A {
    int i, j;
}
class B {
    int i, j;
}
class C extends A {
    int k;
}
class D extends A {
    int k;
}
class InstanceOf {
    public static void main (String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) System.out.println("a is instanceof A");
        
        if (!(a instanceof C)) {
            System.out.println("a is not instance of C");
        }
        if (c instanceof A) {
            System.out.println("c instance of A");
        }
        System.out.println();
        A ob;
        ob = d;
        System.out.println("ob of A refers to D.");
        if (ob instanceof A) {
            System.out.println("Ob instance of A");
        }
        if (ob instanceof D) {
            System.out.println("ob instanceof D");
        }
    }
}