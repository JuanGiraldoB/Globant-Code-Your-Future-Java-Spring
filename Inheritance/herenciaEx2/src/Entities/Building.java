package Entities;

public abstract class Building {
    protected Double width;
    protected Double height;
    protected Double length;

    public Building(Double width, Double height, Double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public abstract double calculateSurface();

    public abstract double calculateVolume();
}
