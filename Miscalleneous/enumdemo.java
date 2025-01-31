enum Apple {
    John, Reddel, Goldendel, Wine, Cort
}
public class enumdemo {
    public static void main(String args[]) {
        Apple ap;
        ap = Apple.Reddel;
        System.out.println("Value of ap: "+ ap);
        ap = Apple.Goldendel;
        
        if (ap == Apple.Goldendel) {
            System.out.println("ap contains: "+ ap);
        }
        switch (ap) {
            case John :
                System.out.println("John is Red");
                break;
            case Goldendel:
                System.out.println("Golden del is Golden.");
                break;
            case Reddel : 
                System.out.println("Reddel is brown.");
                break;
            case Wine:
                System.out.println("Wine is dark.");
                break;
            case Cort:
                System.out.println("Cort is Corn.");
                break;
        }
    }
}
