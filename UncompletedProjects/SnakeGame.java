import java.util.*;
import java.io.*;

class SnakeGame {
    static boolean gameover = false;
    static int width = 40, height = 20;
    static int fruitxy[] = {6,3};
    static int snakex = width/2, snakey = 1;
    static int tailx = snakex + 2, taily = snakey;
    static String[][] backarray = new String[height][width];
    static int score = 0;

    static void backGround() {
        int fruity = fruitxy[0];
        int fruitx = fruitxy[1];

        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0 || j == width - 1 || i == height - 1) {
                    backarray[i][j] = "#";
                } else if (i == fruity && j == fruitx) {
                    backarray[i][j] = "@";
                } else if (backarray[i][j] != "0") {
                    backarray[i][j] = " ";
                }
            }
        }
    };

    static void screen() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(backarray[i][j]);
            }
            System.out.println();
        }
    }

    static void input() {
        System.out.print("Enter your move (w a s d) : ");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        int fruity = fruitxy[0];
        int fruitx = fruitxy[1];
        switch (input) {
            case 'w' :
                if (backarray[snakey - 1][snakex] == "0" || backarray[snakey - 1][snakex] == "#") {
                    gameover = true;
                    return;
                }
                snakey--;
                if (snakey == fruity && snakex == fruitx) {
                    score++;
                    fruitCoords();
                } else {
                    newTail();
                }
                backarray[snakey][snakex] = "0";
                break;

            case 'a' :
                if (backarray[snakey][snakex - 1] == "#" || backarray[snakey][snakex - 1] == "0") {
                    gameover = true;
                    return;
                }
                snakex--;
                if (snakex == fruitx && snakey == fruity) {
                    score++;
                    fruitCoords();
                } else {
                    newTail();
                }
                backarray[snakey][snakex] = "0";
                break;
            case 's' :
                if (backarray[snakey + 1][snakex] == "#" || backarray[snakey + 1][snakex] == "0") {
                    gameover = true;
                    return;
                }
                snakey++;
                if (snakey == fruity && snakex == fruitx) {
                    score++;
                    fruitCoords();
                } else {
                    newTail();
                }
                backarray[snakey][snakex] = "0";
                break;
            case 'd' :
                if (backarray[snakey][snakex + 1] == "#" && backarray[snakey][snakex + 1] == "0") {
                    gameover = true;
                    return;
                }
                snakex++;
                if (snakex == fruitx && snakey == fruity) {
                    score++;
                    fruitCoords();
                } else {
                    newTail();
                }
                backarray[snakey][snakex] = "0";
                break;
            case 'y' :
                gameover = true;
                return;
            default :
                System.out.println("Invalid Input");
                input();
        }
    };
    
    static void newTail() {
        if (backarray[taily][tailx - 1] == "0") backarray[taily][tailx--] = " ";
        if (backarray[taily][tailx + 1] == "0") backarray[taily][tailx++] = " ";
        if (backarray[taily - 1][tailx] == "0") backarray[taily--][tailx] = " ";
        if (backarray[taily + 1][tailx] == "0") backarray[taily++][tailx] = " ";
    }

    static void fruitCoords() {
        Random rand = new Random();
        do {
            fruitxy[1] = rand.nextInt(height);
            fruitxy[0] = rand.nextInt(width);
        } while (backarray[fruitxy[1]][fruitxy[0]] == "0" || backarray[fruitxy[1]][fruitxy[0]] == "#");
        backarray[fruitxy[1]][fruitxy[0]] = "@";
    };

    public static void main(String[] args) {

        backarray[snakey][snakex] = "0";
        backarray[taily][tailx] = "0";
        backarray[taily][snakex + 1] = "0";
        backGround();
        screen();
        while (!gameover) {
            input();
            screen();
        }
        System.out.println("Game Over");
        System.out.println("Your score is : " + score);
    
    }
}
