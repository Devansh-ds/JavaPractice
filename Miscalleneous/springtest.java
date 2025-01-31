public class springtest {
    public static void main (String[] args) {
        String bigs = "Hello, World!";
        String subs = bigs.substring(0, 5);
        String subs2 = bigs.substring(7, bigs.length());

        System.out.println(subs2);
        System.out.println(subs);

        int a = 5;
        String wtf = bigs + a;          // string + integer
        System.out.println(wtf);

        System.out.println(subs2.toUpperCase());
        System.out.println(subs2.toLowerCase());
    }
}
