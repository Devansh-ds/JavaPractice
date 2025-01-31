

public class BitwiseOperations {

    public static void main(String[] args) {
        
        int num = 122;
        String result = "";

        while (num > 0) {

            if (num % 2 != 0) {
                result = "1" + result;
            } else {
                result = "0" + result;
            }
            int remainder = num >> 1;
            num = remainder;
            System.out.println("result : " + result + ", num : " + num);
            
        }

        int bit = 3;
        
        findbit(bit, num);
    }

    public static void findbit(int bit, int num) {
        
        if ((num & (1 << bit)) != 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}