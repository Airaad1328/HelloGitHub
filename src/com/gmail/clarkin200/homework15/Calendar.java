package com.gmail.clarkin200.homework15;

public class Calendar implements Advisable {

    @Override
    public void advice(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("Be clear about your goals and motivation");
            case TUESDAY -> System.out.println("Focus on the important and priority");
            case WEDNESDAY -> System.out.println("Plan your day");
            case THURSDAY -> System.out.println("Organize a comfortable workplace");
            case FRIDAY -> System.out.println("Happy Friday!");
            case SUNDAY -> System.out.println("Go to the cinema");
            case SATURDAY -> System.out.println("Go to the theater");
        }
    }
}
