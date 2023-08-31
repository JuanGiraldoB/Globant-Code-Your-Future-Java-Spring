package Entities;

import java.time.LocalDate;
import java.util.Date;

public class LuxuryYacht extends Boat{

    private Integer horsePower;
    private Integer numberOfCabins;

    public LuxuryYacht(String plate, Integer length, LocalDate fabricationDate, Integer horsePower, Integer numberOfCabins) {
        super(plate, length, fabricationDate);
        this.horsePower = horsePower;
        this.numberOfCabins = numberOfCabins;
    }

    @Override
    public int getModule() {
        int boatModule = super.getModule();
        return boatModule + horsePower + numberOfCabins;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getNumberOfCabins() {
        return numberOfCabins;
    }

    public void setNumberOfCabins(Integer numberOfCabins) {
        this.numberOfCabins = numberOfCabins;
    }

    @Override
    public String toString() {
        return "LuxuryYacht{" +
                "horsePower=" + horsePower +
                ", numberOfCabins=" + numberOfCabins +
                ", plate='" + plate + '\'' +
                ", length=" + length +
                ", fabricationDate=" + fabricationDate +
                '}';
    }
}
