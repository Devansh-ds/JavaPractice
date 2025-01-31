public class SodaSong {
    public static void main (String[] args) {
        int sodanum = 99;
        String name = "Sodas";

        while (sodanum > 0) {
            if (sodanum == 1) {
                name = "lastsoda";
            }

            System.out.println(sodanum + " drink " + name + " on the shelf");
            System.out.println("Take one around");
            System.out.println("Pass it around");
            sodanum = sodanum - 1;

            if (sodanum == 0) {
                System.out.println("-----Its over------");
            } else {}
        }
    }
    
}
