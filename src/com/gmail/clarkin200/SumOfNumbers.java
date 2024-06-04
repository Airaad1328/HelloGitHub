package com.gmail.clarkin200;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sumNumbers = 0;
        int cycleSize = 6;
        int i = 1;
        for (i = 1; i <= cycleSize; i++) {
            sumNumbers += i;
            System.out.println("Num is " + i + " sum is " + sumNumbers);
        }
        System.out.println("--------------------------");
        System.out.println("Sum of number " + sumNumbers);
        System.out.println();
        i = 1;
        sumNumbers = 0;
        while (i <= cycleSize) {
            sumNumbers += i;
            System.out.println("Num is " + i + " sum is " + sumNumbers);
            i++;
        }
        System.out.println("--------------------------");
        System.out.println("Sum of number " + sumNumbers);
        System.out.println();
        i = 1;
        sumNumbers = 0;
        do {
            sumNumbers += i;
            System.out.println("Num is " + i + " sum is " + sumNumbers);
            i++;
        } while (i <= cycleSize);
        System.out.println("--------------------------");
        System.out.println("Sum of number " + sumNumbers);
    }
}
