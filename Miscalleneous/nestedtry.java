public class nestedtry {
    public static void main(String args[]) {
        int a = 2;

        try {
            int b = 34 / a;
            System.out.println("Inside first try, a is " + a);
            
            try {
                if (a == 1) a = 23/(a-a);
                if (a == 2) {
                    int[] c = {2,3};
                    c[32] = 34;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index out of bounds");
            }
        } catch(ArithmeticException e) {
            System.out.println("Divided by 0");
        }
    }
}
