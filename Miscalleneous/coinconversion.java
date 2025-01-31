import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.io.IOException;

public class coinconversion {
    public static void main (String args[]) {
        try {
            final double NICKEL_VALUE = 0.05;
            final double PENNY_VALUE = 0.01;
            final double DIME_VALUE = 0.10;
            final double QUATER_VALUE = 0.25;

            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader console = new BufferedReader(reader5);

            System.out.println("How many pennies you have? ");
            String input = console.readLine();
            int pennies = Integer.parseInt(input);

            System.out.println("How many nickel you have? ");
            input = console.readLine();
            int nickels = Integer.parseInt(input);

            System.out.println("How many dimes you have? ");
            input = console.readLine();
            int dimes = Integer.parseInt(input);

            System.out.println("How many quaters you have? ");
            input = console.readLine();
            int quaters = Integer.parseInt(input);

            double total = pennies*PENNY_VALUE + nickels*NICKEL_VALUE + dimes*DIME_VALUE + quaters*QUATER_VALUE;
            System.out.println("Total money is " + total + "$");
        }
        catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
