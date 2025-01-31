public class throwexec {
    static void demoprog() {
        try {
            throw NullPointerException("demo");
        } catch (NullPointerExceptione e) {
            System.out.println("Caught Inside demoprog");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            demoprog();
        } catch (NullPointerExceptione e) {
            System.out.println("Recaught in main.");
            System.out.println(e);
        }
    }
}
