class MyException extends Exception{
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
public class MyExecption {
    public static void compute (int a) throws MyException {
        System.out.println("Called compute : " + a);
        if (a > 1) {
            throw new MyException(a);
        }
        System.out.println("Normally exited");
    }
    public static void main(String[] args) {
        try {
            compute(1);
            compute(10);
        } catch (MyException e) {
            System.out.println("Caught : " + e);
        }
    }
}
