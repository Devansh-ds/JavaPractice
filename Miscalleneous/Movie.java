class Movie {
    String title;
    String genre;
    int Rating;

    void playit() {
        System.out.println("Playing the movie.");
    }
}

class MovieTestDrive {
    public static void main (String[] args) {
        Movie one = new Movie();
        one.title = "You cant see me.";
        one.genre = "John Cena";
        one.Rating = 9;

        Movie two = new Movie();
        two.title = "I dont know";
        two.genre = "Comedy";
        two.Rating = 1;

        one.playit();
        two.playit();
        }
}
