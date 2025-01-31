class FixedStk implements IntStack {
    private int[] stck;
    private int tos;

    FixedStk(int size) {
        stck = new int[size];
        tos = -1;
    }
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full");
        }
        else {
            stck[++tos] = item;
        }
    }
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow.");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}
class FixedStkTest {
    public static void main(String[] args) {
        FixedStk stk1 = new FixedStk(5);
        FixedStk stk2 = new FixedStk(8);

        for (int i = 0; i<5; i++) stk1.push(i);
        for (int i = 0; i<8; i++) stk2.push(i);

        System.out.println("Items in stk1:");
        for (int i = 0; i<5; i++)  System.out.println(stk1.pop());
        System.out.println("Items in stk2:");
        for (int i = 0; i<8; i++) System.out.println(stk2.pop());
    }
}