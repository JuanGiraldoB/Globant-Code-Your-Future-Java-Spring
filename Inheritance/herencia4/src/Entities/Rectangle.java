package Entities;

import Interfaces.ShapeCalculations;

public class Rectangle implements ShapeCalculations {

    private Double base;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public double calculatePerimeter() {
        return (base + height) * 2;
    }
}
