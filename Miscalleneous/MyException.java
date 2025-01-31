class newexec extends Exception {
    private int detail;
    newexec(int a) {
        detail = a;
    }

    public String toString() {
        return "My exception [" + detail + "]";
    }
}
class MyException {
    static void compute(int a) throws newexec {
        System.out.println("Called compute.");
        if (a>10) 
            throw new newexec(a);
        System.out.println("Normal exit.");
    }
    public static void main(String args[]) {
        try {
            compute(1);
            compute(20);
        } catch (newexec e) {
            System.out.println("Caught : " + e);
        }
    }
}
