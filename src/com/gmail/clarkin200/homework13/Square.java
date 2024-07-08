package com.gmail.clarkin200.homework13;

public class Square implements Geometricable{
    private double area;

    Square(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}
