package com.gmail.clarkin200;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        double result ;
        if (input <= 0) {
            System.out.println("Error too low input");
        }
        else if (input<=10000) {
            result = input - (2.5*input/100);
            System.out.printf("Your profit is : %.2f",result);
        }
        else if(input<=25000){
            result = input - (4.3*input/100);
            System.out.printf("Your profit is : %.2f",result);
        }
        else
        {
            result = input - (6.7*input/100);
            System.out.printf("Your profit is : %.2f",result);
        }
    }
}
