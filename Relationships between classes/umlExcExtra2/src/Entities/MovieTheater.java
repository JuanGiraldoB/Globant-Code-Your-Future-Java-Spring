package Entities;

import java.util.ArrayList;
import java.util.Random;

public class MovieTheater {

    private Movie currentMovie;
    private Integer ticketPrice;
    private final String [][] matrix = new String[8][6];
    private ArrayList<Spectator> spectators;

    private final Integer NUMBER_OF_SEATS = 48;
    private final int filledSeats = 0;

    public MovieTheater(Movie currentMovie, Integer ticketPrice) {
        this.currentMovie = currentMovie;
        this.ticketPrice = ticketPrice;
        spectators = new ArrayList<>();
    }


    public void createTheater() {
        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (char)('A' + col) + "" + (8 - row);
            }
        }
    }

    public boolean placeSpectator(Spectator spectator, Movie movie, int row, int col) {
        if (!isFull()) {
            return false;
        }

        boolean gotTicket = buyTicket(spectator, movie);
        if (!gotTicket) {
            return false;
        }

        if (isSeatEmpty(row, col)) {
            fillSeat(row, col);
        }else {
            int [] seatPos = findSeat();
            fillSeat(seatPos[0], seatPos[1]);
        }

        return true;
    }

    public void showTheater() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public boolean isSeatEmpty(int row, int col) {
        return !matrix[row][col].contains("X");
    }

    public int[] findSeat() {
        Random rand = new Random();
        int row = rand.nextInt(8);
        int col = rand.nextInt(6);

        while (!isSeatEmpty(row, col)) {
            row = rand.nextInt(8);
            col = rand.nextInt(6);
        }

        return new int[] {
            row, col
        };
    }

    public void fillSeat(int row, int col) {
        matrix[row][col] = matrix[row][col] + "X";
    }
    
    public boolean buyTicket(Spectator spectator, Movie movie) {
        return spectator.getMoney() >= ticketPrice && spectator.getAge() >= movie.getMinimumAge();
    }

    public boolean isFull(){
        return filledSeats < NUMBER_OF_SEATS;
    }

    public Movie getCurrentMovie() {
        return currentMovie;
    }

    public void setCurrentMovie(Movie currentMovie) {
        this.currentMovie = currentMovie;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public ArrayList<Spectator> getSpectators() {
        return spectators;
    }

    public void setSpectators(ArrayList<Spectator> spectators) {
        this.spectators = spectators;
    }
}

