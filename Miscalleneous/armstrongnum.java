public class armstrongnum {
    public static void main(String[] args) {
        int num = 1634;
        int count = 0;
        int tmp = num;
        int sum = 0;
        int otmp = num;
        while (tmp != 0) {
            count++;
            tmp /= 10;
        }
        for (int i = 0; i < count; i++) {
            sum += Math.pow(num%10, count);
            num /= 10;
        }
        if (sum == otmp) {
            System.out.println("Is a armstrong num.");
        } else {
            System.out.println("NOt a armstrong num.");
        }
    }
}
