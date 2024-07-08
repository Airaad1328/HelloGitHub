package com.gmail.clarkin200.homework13;

public class Circle implements Geometricable {
    private double area;

    Circle(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}
