package Entities;

import java.time.LocalDate;
import java.util.Date;

public class Boat {
    protected String plate;
    protected Integer length;
    protected LocalDate fabricationDate;

    public Boat(String plate, Integer length, LocalDate fabricationDate) {
        this.plate = plate;
        this.length = length;
        this.fabricationDate = fabricationDate;
    }

    public int getModule() {
        return length * 10;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }
}
