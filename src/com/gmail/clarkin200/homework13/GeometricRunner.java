package com.gmail.clarkin200.homework13;

public class GeometricRunner {
    public static void main(String[] args) {
        Geometricable[] geometric = {
                new Circle(45.23),
                new Square(54.22),
                new Triangle(99.754)
        };
        System.out.println("Sum of figure = " + sumArea(geometric));
    }

    public static double sumArea(Geometricable[] geometric) {
        double sumResult = 0;
        for (Geometricable figure : geometric) {
            sumResult += figure.getArea();
        }
        return sumResult;
    }
}
