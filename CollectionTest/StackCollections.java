import java.util.*;

public class StackCollections {
    public static void main(String args[]) {
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        System.out.println(stk.peek());
    }
}
