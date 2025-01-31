public class primenum {
    public static void main (String args[]) {
        
        int num;
        boolean isPrime = true;
        num = 107;
        //iterated from 2 to half of the number
        for (int i = 2; i <= num/2; ++i) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Is it a prime num? "+ isPrime);
    }
}
