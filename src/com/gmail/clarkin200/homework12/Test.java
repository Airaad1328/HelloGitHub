package com.gmail.clarkin200.homework12;

public class Test {
    public static void main(String[] args) {
        Employee person = new Employee("Seitdzhelilov Renat Leonidovich","developer","clarkin200@gmail.com","+38066955495",18);
        Car car = new Car();
        person.print();
        car.start();
        car.stop();
    }
}
