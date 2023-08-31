package Entities.Accomodations;

import Enums.GymType;

public class Gym {

    private GymType gymType;
    private Integer price;

    public Gym(GymType gymType) {
        this.gymType = gymType;
        price = calcualtePrice();
    }

    private int calcualtePrice() {
        if (gymType.equals(GymType.A)){
            return 50;

        }

        return 30;
    }

    public GymType getGymType() {
        return gymType;
    }

    public void setGymType(GymType gymType) {
        this.gymType = gymType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "gymType=" + gymType +
                ", price=" + price +
                '}';
    }
}
