import Entities.Movie;
import Entities.MovieTheater;
import Entities.Spectator;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie("oppenheimer", 3, 18, "Nolan");
        MovieTheater mt = new MovieTheater(movie, 15000);
        mt.createTheater();

        seatSpectators(mt, movie);

        System.out.println();
        mt.showTheater();
    }

    public static void seatSpectators(MovieTheater mt, Movie movie) {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int row = rand.nextInt(8);
            int col = rand.nextInt(6);

            Spectator spectator = new Spectator("a", rand.nextInt(50), rand.nextInt(40000));
            System.out.println(spectator);
            if (mt.placeSpectator(spectator, movie, row, col)) {
                System.out.println("Placed");
            } else {
                System.out.println("Not placed");
            }

        }
    }

}
