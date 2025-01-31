class breaklabel {
    public static void main (String args[]) {
        boolean t = true;
         
        first: {
            second: {
                third: {
                    System.out.println("Inside third block");
                    if (t) break second;
                    System.out.println("This wont execute");
                }
                System.out.println("In second block");
            }
            System.out.println("In first block");
        }
    }
}
