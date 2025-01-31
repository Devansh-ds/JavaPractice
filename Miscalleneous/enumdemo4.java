enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
   }
public class enumdemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        System.out.println("Here are all apple constants and their ordinal values.");

        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple.RedDel;
        ap3 = Apple.RedDel;
        ap2 = Apple.GoldenDel;

        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " comes before " + ap2);
        }
        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " is same as " + ap3);
        }
        if (ap.equals(ap3)) {
            System.out.println(ap + " equals to " + ap3);
        }
        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }
    }
}
