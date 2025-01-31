public class Exc1 {
    public static void main(String args[]) {
        int d, a;

        try {
            d = 0;
            a = 32 / d;
            System.out.println("This will not print.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
            System.out.println(e);
        }
    }
}
