enum Apple {
    John, Reddel, Goldendel, Wine, Cort
}
public class enumdemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are all the values of Apple.");
        Apple allapple[] = Apple.values();
        for (Apple a : allapple) {
            System.out.println(a);
        }
        System.out.println();
        ap = Apple.valueOf("Wine");
        System.out.println("ap contains " + ap);
    }
}
