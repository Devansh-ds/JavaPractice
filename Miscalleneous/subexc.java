public class subexc {
    public static void main (String args[]) {
        try {
            int a = 0;
            int b = 43 / a;
        } catch (Exception e) {
            System.out.println("Generic exception.");
        }
        catch (ArithmeticException e) {
            System.out.println("this never run.");
        }
    }
}
