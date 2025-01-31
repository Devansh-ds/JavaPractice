public class conversion {
    public static void main (String args[]) {
        byte b;
        int i = 257;
        double d = 456.345;

        b = (byte) i;
        System.out.println(b);
        i = (int) d;
        b = (byte) d;

        System.out.println(i);
    }
}
