package Entities;

import java.time.LocalDate;

public class Rental {
    private String clientName;
    private String document;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private String moorPosition;
    private Boat boat;

    public Rental() {
    }

    public Rental(String clientName, String document, LocalDate rentDate, LocalDate returnDate, String moorPosition, Boat boat) {
        this.clientName = clientName;
        this.document = document;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.moorPosition = moorPosition;
        this.boat = boat;
    }

    public int calculateRentPrice() {
        int numberOfDays = returnDate.getDayOfYear() - rentDate.getDayOfYear();
        int module = boat.getModule();
        return numberOfDays * module;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "name='" + clientName + '\'' +
                ", document='" + document + '\'' +
                ", rentDate=" + rentDate +
                ", returnDate=" + returnDate +
                ", moorPosition='" + moorPosition + '\'' +
                ", boat=" + boat +
                '}';
    }
}
