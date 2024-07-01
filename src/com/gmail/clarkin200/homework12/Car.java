package com.gmail.clarkin200.homework12;

public class Car {
    private boolean Electricity;
    private int fuel;

    Car() {
        this.Electricity = false;
        this.fuel = 10;
    }

    private void startElectricity() {
        this.Electricity = true;
    }

    private void startCommand() {
        System.out.println("Engine is working!");
    }

    private void startFuelSystem() {
        this.fuel -= 1;
    }

    public void start() {
        while (fuel != 0) {
            startElectricity();
            startCommand();
            startFuelSystem();
        }
    }

    public void stop() {
        this.Electricity = false;
        System.out.println("Engine is not working!");
    }

}
