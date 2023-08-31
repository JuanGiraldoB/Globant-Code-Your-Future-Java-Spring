package Entities;

import Interfaces.ShapeCalculations;

public class Circle implements ShapeCalculations {

    private Double radius;
    private Double diameter;

    public Circle() {
    }

    public Circle(Double radius, Double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return PI * diameter;
    }
}
