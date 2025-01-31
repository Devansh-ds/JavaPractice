class A {
    void callme() {
        System.out.println("Inside A");
    }
}
class B extends A {
    void callme() {
        System.out.println("Inside B");
    }
}
class C extends B {
    void callme() {
        System.out.println("Inside C");
    }
}
class dynamicmeth {
    public static void main (String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();
    }
}