package Entities;

import java.time.LocalDate;
import java.util.Date;

public class MotorBoat extends Boat{

    private Integer horsePower;

    public MotorBoat(String plate, Integer length, LocalDate fabricationDate, Integer horsePower) {
        super(plate, length, fabricationDate);
        this.horsePower = horsePower;
    }

    @Override
    public int getModule() {
        int boatModule = super.getModule();
        return boatModule + horsePower;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "MotorBoat{" +
                "horsePower=" + horsePower +
                ", plate='" + plate + '\'' +
                ", length=" + length +
                ", fabricationDate=" + fabricationDate +
                '}';
    }
}
