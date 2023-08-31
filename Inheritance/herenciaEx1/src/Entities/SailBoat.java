package Entities;

import java.time.LocalDate;
import java.util.Date;

public class SailBoat extends Boat{

    private Integer numberOfMast;


    public SailBoat(String plate, Integer length, LocalDate fabricationDate, Integer numberOfMast) {
        super(plate, length, fabricationDate);
        this.numberOfMast = numberOfMast;
    }

    @Override
    public int getModule() {
        int boatModule = super.getModule();
        return boatModule + numberOfMast;
    }

    public Integer getNumberOfMast() {
        return numberOfMast;
    }

    public void setNumberOfMast(Integer numberOfMast) {
        this.numberOfMast = numberOfMast;
    }

    @Override
    public String toString() {
        return "SailBoat{" +
                "numberOfMast=" + numberOfMast +
                ", plate='" + plate + '\'' +
                ", length=" + length +
                ", fabricationDate=" + fabricationDate +
                '}';
    }
}
