class arr {
    static void test(int ...v) {
        System.out.println("Length of array is " + v.length);
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String args[]) {
     /* int n1[] = {19};
        int n2[] = {1, 3, 4};
        int n3[] = {}; */

        test(1, 3, 4, 5);
        test();
        test(1);   
    }
}