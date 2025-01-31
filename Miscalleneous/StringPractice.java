public class StringPractice {
    public static void main(String[] args) {
        String s1 = "java";
        char[] ch1  = {'s', 't', 'r', 'i', 'n', 'g'};
        String s2 = new String(ch1);
        String s3 = new String("example");
        String s4 = "example";
        String s5 = "";
        String s6 = "jaxa";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s3 == s4);

        char ch = s1.charAt(0);
        System.out.println(ch);
        System.out.println(s3.charAt(s3.length() - 1));

        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s5));
        System.out.println(s5.compareTo(s1));
        System.out.println(s1.compareTo(s6));
        
        System.out.println(s1.concat(s4));
        System.out.println(s1);
    }
}
