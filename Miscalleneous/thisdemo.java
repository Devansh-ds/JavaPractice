public class thisdemo {
    int i = 0;
    thisdemo increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println(i);
    }
    public static void main(String[] args) {
        thisdemo ob = new thisdemo();
        ob.increment().increment().increment().print();
    }
}
