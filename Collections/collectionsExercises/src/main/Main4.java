package main;

import main.Entities.Movie;
import main.Services.MovieService;

public class Main4 {
    public static void main(String[] args) {
        MovieService ms = new MovieService();
        Movie movie = ms.createMovie();
        ms.addMovie(movie);

        Movie movie1 = ms.createMovie();
        ms.addMovie(movie1);

//        ms.printMoviesByDuration(2);
        System.out.println("Asc duration");
        ms.ascSortByDuration();
        ms.printMovies();

        System.out.println("Dsc duration");
        ms.descSortByDuration();
        ms.printMovies();

        System.out.println("Asc title");
        ms.ascSortByTitle();
        ms.printMovies();


        System.out.println("Dsc title");
        ms.dscSortByTitle();
        ms.printMovies();

        System.out.println("Asc director");
        ms.ascSortByDirector();
        ms.printMovies();


        System.out.println("Dsc director");
        ms.dscSortByDirector();
        ms.printMovies();
    }
}
