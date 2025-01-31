public class ChainExec {
    static void demoproc() {
        NullPointerException e = new NullPointerException("top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }
    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Caught : " + e);
            System.out.println("original Cause : " + e.getCause());
        }
    }
}
