public class AutoBox1 {
    static int m(Integer v) {
        return v;
    }
    public static void main(String[] args) {
        Integer iob = m(100);
        System.out.println(iob);
        
        Integer iob2 = 100;
        Double dob = 87.8;
        System.out.println(iob2 + dob);
    }
}
