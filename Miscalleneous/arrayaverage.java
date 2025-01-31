public class arrayaverage {
    public static void main (String args[]) {

        //int nums[] = new int[5];
        int nums[] = {1, 2, 3, 4, 5};
        double result = 0;
        int i;
        
        for (i = 0; i<5; i++) {
            result = result + nums[i];
        }
        System.out.println("Average is " + result/5);
    }
}
