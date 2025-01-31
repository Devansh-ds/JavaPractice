import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        boolean choice = true;
        Scanner sc = new Scanner(System.in);

        while (choice) {
            System.out.print("Wanna continue? (Y/N) : ");
            choice = sc.nextBoolean();

            if (choice) {
                startRegex();
            } else {
                choice = false;
            }
        }
    }
    public static void startRegex() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Regex pattern: ");
        String pattern = sc.nextLine();

        System.out.print("Enter string for the pattern: ");
        String string = sc.nextLine();

        Pattern pt = Pattern.compile(pattern);
        Matcher matcher = pt.matcher(string);

        System.out.println("Matches: " + matcher.matches());

    }
}










