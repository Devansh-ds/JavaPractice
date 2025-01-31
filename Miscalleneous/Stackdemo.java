class Stacks {
    int stack[] = new int[10];
    int tos = -1;

    void push(int item) {
        if (tos == 9) 
           System.out.println("Stack is full");
        else 
           stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow");
            return 110;
        } else return stack[tos--];
    }
}
class Stackdemo {
    public static void main(String args[]) {
        Stacks stk1 = new Stacks();
        Stacks stk2 = new Stacks();

        for (int i = 0; i < 10; i++) stk1.push(i);
        for (int j = 10; j < 20; j++) stk2.push(j);

        for (int i = 0; i < 11; i++) System.out.println(stk1.pop());
        for (int j = 0; j < 10; j++) System.out.println(stk2.pop());

    }
}