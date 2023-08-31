package Entities;

import Enums.SportsCenterType;

public class SportsCenter extends Building{

    private String name;
    private SportsCenterType sportsCenterType;

    public SportsCenter(Double width, Double height, Double length, String name, SportsCenterType sportsCenterType) {
        super(width, height, length);
        this.name = name;
        this.sportsCenterType = sportsCenterType;
    }

    @Override
    public double calculateSurface() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SportsCenterType getSportsCenterType() {
        return sportsCenterType;
    }

    public void setSportsCenterType(SportsCenterType sportsCenterType) {
        this.sportsCenterType = sportsCenterType;
    }
}
