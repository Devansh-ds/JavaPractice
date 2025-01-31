public class StrMethodDemp {
    public static void main(String[] args) {
        String s = "This is a demo String to test methods.";
        int start = 8;
        int end = 16;
        char buffs[] = new char[end - start];
        s.getChars(start, end, buffs, 0);
        System.out.println(buffs);

        String s1 = "namedevansh";
        String s2 = "johnDEvansh";
        System.out.println(s1.regionMatches(true, 4, s2, 4, 7));
        System.out.println("sexySheela".startsWith("sexy"));
        String s3 = new String(s1);
        System.out.println();
        System.out.println(s3.equals(s1));
        System.out.println(s3 == s1);
        System.out.println();
        System.out.println(s1.indexOf("van"));
    }
}
