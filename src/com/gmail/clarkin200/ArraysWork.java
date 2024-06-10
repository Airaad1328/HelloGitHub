package com.gmail.clarkin200;

import java.beans.PropertyEditorSupport;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysWork {
    public static void main(String[] args) {
        int[] array = new int[20];
        int negativeSum;
        int evenCounter;
        int oddCounter;
        int smallestElement;
        int smallestElementCounter;
        int largestElement;
        int largestElementCounter;
        float arithmeticMean;

        //Creating and fill array
        fillArray(array);
        System.out.print("Array elements: ");
        printArray(array);
        //Find um of negative numbers
        System.out.println();
        negativeSum = findSumNegativeElement(array);
        System.out.println("The sum of negative numbers: " + negativeSum);
        //Find and output the number of even and odd numbers in an array.
        evenCounter = findEvenCount(array);
        oddCounter = findOddCount(array);
        System.out.println("Number of even numbers: " + evenCounter);
        System.out.println("Number of odd numbers: " + oddCounter);
        //Find the largest and smallest array elements and their indices.
        smallestElement = array[findSmallestElement(array)];
        smallestElementCounter = findSmallestElement(array);
        System.out.println("Smallest element: " + smallestElement + " (with index " + smallestElementCounter + ")");
        largestElement = array[findLargestElement(array)];
        largestElementCounter = findLargestElement(array);
        System.out.println("Largest element: " + largestElement + " (with index " + largestElementCounter + ")");
        //The arithmetic mean of the numbers after the first negative number
        arithmeticMean = findArithmeticMean(array);
        System.out.println("Arithmetic averages after the first number: " + arithmeticMean);
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 101);
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int findSumNegativeElement(int[] array) {
        int result = 0;
        for (int i : array) {
            if (i < 0) {
                result += i;
            }
        }
        return result;
    }

    public static int findOddCount(int[] array) {
        int result = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                result++;
            }
        }
        return result;
    }

    public static int findEvenCount(int[] array) {
        int result = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int findSmallestElement(int[] array) {
        int smalestElement = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] < smalestElement) {
                smalestElement = array[i];
                result = i;
            }
        }
        return result;
    }

    public static int findLargestElement(int[] array) {
        int largestElement = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] > largestElement) {
                largestElement = array[i];
                result = i;
            }
        }
        return result;
    }

    public static float findArithmeticMean(int[] array) {
        float result;
        float elementSum = 0;
        float counter = 0;
        boolean flagForNegativeElement = false;
        for (int i : array) {
            if (flagForNegativeElement) {
                elementSum += i;
                counter++;
            }
            if (i < 0 && !flagForNegativeElement) {
                flagForNegativeElement = true;
            }
        }
        if (!flagForNegativeElement) {
            System.out.println("Error ,the array has no negative elements");
            return 0;
        } else {
            result = (float) (elementSum / counter);
            return result;
        }
    }
}







