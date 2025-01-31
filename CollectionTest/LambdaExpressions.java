interface func {
    void abstractFun(int x);

    default void normalFun() {
        System.out.println("HI");
    }
}

public class LambdaExpressions {
    public static void main(String args[]) {
        func obj = (int x) -> System.out.println(2*x);
        obj.abstractFun(5);
    }
}
