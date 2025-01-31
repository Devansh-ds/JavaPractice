class integer {
    public static void main (String args[]) {
        double op = 3E6;
        System.out.println(op);
        System.out.println(op - 0.00000000005);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        double dec = 3.14;
        int i = (int) dec;
        System.out.println(i);
        System.out.println((double) i);         // int to double

        float f = (float) 3.34;             // double to float
        System.out.println(f);

        double dollars = 34.95;
        int roundoff = (int) Math.round(dollars);           // Math.round give "long" output
        System.out.println(roundoff);

        String bin = Integer.toString(84, 2);         // int to binary
        System.out.println(bin);
        int num = Integer.parseInt(bin, 2);             // binary to int
        System.out.println(num);
        // System.out.println(3**4);
    }
}