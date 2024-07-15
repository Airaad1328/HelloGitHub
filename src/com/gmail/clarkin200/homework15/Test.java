package com.gmail.clarkin200.homework15;

public class Test {
    public static void main(String[] args) {
        Advisable calendar = new Calendar();
        calendar.advice(Day.MONDAY);
        calendar.advice(Day.TUESDAY);
        calendar.advice(Day.WEDNESDAY);
        calendar.advice(Day.THURSDAY);
        calendar.advice(Day.FRIDAY);
        calendar.advice(Day.SATURDAY);
        calendar.advice(Day.SUNDAY);
    }
}
