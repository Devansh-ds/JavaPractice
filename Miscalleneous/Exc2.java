import java.util.Random;

public class Exc2 {
    public static void main (String args[]) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 200; i++) {
            try {
                b = r.nextInt();
                // c = r.nextInt();
                a = 12345 / b;
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");

            }
            System.out.println("a : " + a);
        }
    }
}
