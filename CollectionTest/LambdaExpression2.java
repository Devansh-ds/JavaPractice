interface func {
    void test(int a);
}

public class LambdaExpression2 {
    public static void main(String[] args) {
        func obj = (int n) -> System.out.println("hi");
        obj.test(5);

    }
}
