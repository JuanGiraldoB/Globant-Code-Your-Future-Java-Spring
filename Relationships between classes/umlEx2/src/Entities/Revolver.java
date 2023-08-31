package Entities;

import java.util.Random;

public class Revolver {

    private Integer currentPosition;
    private Integer waterPostion;


    public Revolver() {
        fillRevolver();
    }

    public void fillRevolver() {
        Random random = new Random();
        this.currentPosition = random.nextInt(6) + 1;
        this.waterPostion = random.nextInt(6) + 1;
    }

    public boolean wet() {
        return currentPosition.equals(waterPostion);
    }

    public void nextShot() {
        if (this.currentPosition.equals(6)) {
            this.currentPosition = 0;
        } else {
            this.currentPosition++;
        }
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public Integer getWaterPostion() {
        return waterPostion;
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "currentPosition=" + currentPosition +
                ", waterPostion=" + waterPostion +
                '}';
    }
}
