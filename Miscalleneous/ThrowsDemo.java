public class ThrowsDemo {
    static void test() throws IllegalAccessException {
        System.out.println("Inside test method");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
        try {
            test();
        } catch (IllegalAccessException e) {
            System.out.println("Caught --> " + e);
        }
    }
}
