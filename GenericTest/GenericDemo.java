class Gen<T> {
    T ob;
    Gen(T o) {
        ob = o;
    }
    T getob() {
        return ob;
    }
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
class GenericDemo {
    public static void main(String args[]) {
        Gen<Integer> iob;
        iob = new Gen<Integer>(88);
        iob.showType();
        int v = iob.getob();
        System.out.println("Value : " + v);

        Gen<String> sob;
        sob = new Gen<String>("Selmon bhai");
        sob.showType();
        String str = sob.getob();
        System.out.println("Value : " + str);
    }
}