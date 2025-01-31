class supers {
    int i, j;

    void showij() {
        System.out.println("i and j : " + i + " and " + j);
    }
}
class subs extends supers {
    int k;

    void showk() {
        System.out.println("k is : " + k);
    }
    void sum() {
        i = i*2;
        j = j*2;
        System.out.println("Sum is : "+ (i+j+k));
    }
}
class inheritance {
    public static void main(String args[]) {
        supers sup = new supers();
        sup.i = 10;
        sup.j = 20;
        sup.showij();

        subs sub = new subs();
        sub.k = 1;
        sub.i = 2;
        sub.j = 3;
        sub.sum();

    }
}