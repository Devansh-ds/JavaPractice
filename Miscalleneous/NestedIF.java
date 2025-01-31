class A {
    public interface nestedif {
        boolean isnotneg(int x);
    }
}
class B implements A.nestedif {
    public boolean isnotneg(int x) {
        return x < 0 ? false: true;
    }
}
class NestedIF {
    public static void main(String args[]) {
        A.nestedif nif = new B();

        if (nif.isnotneg(10)) {
            System.out.println("True.");
        }
        if (nif.isnotneg(-21)) {
            System.out.println("Wont print.");
        }
    }
}