package com.gmail.clarkin200;

public class SumOfNumbers {
    public static void main(String[] args)
    {
        int sumNumbers = 0;
        int cycleSize = 6;
        for(int i = 1; i <= cycleSize;i++)
        {
            sumNumbers+=i;
            System.out.println("Num is " + i +" sum is " + sumNumbers);
        }
        System.out.println("--------------------------");
        System.out.println("Sum of number "+ sumNumbers);
    }

}
