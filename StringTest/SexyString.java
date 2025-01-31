public class SexyString {
    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd', 'e'};
        byte ascii[] = {65, 66, 67, 68, 69, 70};

        String s1 = new String(chars, 2, 2);
        String s2 = new String(s1);
        String s3 = new String(ascii, 1, 3);
        System.out.println(s3);
        System.out.println(s1 + " " + s2);
        System.out.println(s2.length());
        String s4 = "hi asshole : " + 2.86 + (char) (3 + 'a');
        System.out.println(s4);
    }
}
