package main.Services;

import main.Entities.Movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class MovieService {

    private ArrayList<Movie> movies;
    private Scanner scan;

    public MovieService() {
        this.movies = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }

    public Movie createMovie() {
        System.out.print("Title: ");
        String title = scan.next();

        System.out.print("Director: ");
        String director = scan.next();

        System.out.print("Duration: ");
        int duration = scan.nextInt();

        return new Movie(title, director, duration);
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void printMovies() {
        Iterator iterator = movies.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printMoviesByDuration(int duration) {

        Iterator<Movie> iterator = movies.iterator();

        while (iterator.hasNext()) {
            Movie movie = iterator.next();

            if (movie.getDuration() > duration) {
                System.out.println(movie);
            }
        }
    }

    public void ascSortByDuration() {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getDuration().compareTo(o2.getDuration());
            }
        });
    }

    public void descSortByDuration() {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getDuration().compareTo(o1.getDuration());
            }
        });
    }

    public void ascSortByTitle() {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }

    public void dscSortByTitle() {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });
    }

    public void ascSortByDirector() {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getDirector().compareTo(o2.getDirector());
            }
        });
    }

    public void dscSortByDirector() {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getDirector().compareTo(o1.getDirector());
            }
        });
    }

}
