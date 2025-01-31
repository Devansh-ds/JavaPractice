public class check {
    public static void main (String[] args) {

        System.out.println("Hello java");
        System.out.println("Hellotwice");
        int x = 3;
        String name = "Devansh";
        x = x*17;
        System.out.println("x is : " + x);
        double d = Math.random();
        System.out.println("d is "+ d);

        //while loop uses
        System.out.println("Using while loop");
        while (x > 12) {
            x = x - 1;
            System.out.println("x is "+ x);
        }
        System.out.println("Out of while loop");

        //using for loop
        for (int y = 0; y < 10; y = y + 1) {
            System.out.println("y is now " + y);
        }
    }

}