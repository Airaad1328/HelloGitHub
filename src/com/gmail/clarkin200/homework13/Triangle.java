package com.gmail.clarkin200.homework13;

public class Triangle implements Geometricable {
    private double area;

    Triangle(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}
