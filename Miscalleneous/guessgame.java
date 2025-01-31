class guessgam {
    Player p1;
    Player p2;
    Player p3;

    void startgame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;

        boolean right1 = false;
        boolean right2 = false;
        boolean right3 = false;

        int targetnum = (int) (Math.random()*10);
        System.out.println("I am guess a number between - and 9");

        while (true) {
            System.out.println("Number to guess is " + targetnum);

            p1.guess();
            p2.guess();
            p3.guess();

            guess1 = p1.number;
            guess2 = p2.number;
            guess3 = p3.number;
            
            if (guess1 == targetnum) {
                right1 = true;
            }
            if (guess2 == targetnum) {
                right2 = true;
            }
            if (guess3 == targetnum) {
                right3 = true;
            }
            
            if (right1 || right2 || right3) {
                System.out.println("Player1 " + right1);
                System.out.println("Player2" + right2);
                System.out.println("Player3 " + right3);
                break;
            } else {
                System.out.println("Try again!!");
            }
        }
    }
}

class Player {
    int number = 0;
    void guess() {
        number = (int) (Math.random()*10);
        System.out.println("I am guessing a " + number);
    }
}

public class guessgame {
    public static void main (String[] args) {
        guessgam game = new guessgam();
        game.startgame();
    }
}