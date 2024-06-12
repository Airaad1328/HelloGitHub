package com.gmail.clarkin200;

import java.util.concurrent.ThreadLocalRandom;

public class ArraysWork {
    public static void main(String[] args) {
        int[] array = new int[20];
        //Creating and fill array
        fillArray(array);
        System.out.print("Array elements: ");
        printArray(array);
        //Find um of negative numbers
        System.out.println();
        int negativeSum = findSumNegativeElement(array);
        System.out.println("The sum of negative numbers: " + negativeSum);
        //Find and output the number of even and odd numbers in an array.
        int evenCounter = findEvenCount(array);
        int oddCounter = findOddCount(array);
        System.out.println("Number of even numbers: " + evenCounter);
        System.out.println("Number of odd numbers: " + oddCounter);
        //Find the largest and smallest array elements and their indices.
        int smallestElement = array[findSmallestIndex(array)];
        int smallestElementIndex = findSmallestIndex(array);
        System.out.println("Smallest element: " + smallestElement + " (with index " + smallestElementIndex + ")");
        int largestElement = array[findLargestElement(array)];
        int largestElementCounter = findLargestElement(array);
        System.out.println("Largest element: " + largestElement + " (with index " + largestElementCounter + ")");
        //The arithmetic mean of the numbers after the first negative number
        float arithmeticMean = findArithmeticMean(array);
        if (arithmeticMean != 0) {
            System.out.println("Arithmetic averages after the first number: " + arithmeticMean);
        } else {
            System.out.println("Error,the array has no negative elements");
        }
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 101);
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static int findSumNegativeElement(int[] array) {
        int result = 0;
        for (int element : array) {
            if (element < 0) {
                result += element;
            }
        }
        return result;
    }

    public static int findOddCount(int[] array) {
        int result = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                result++;
            }
        }
        return result;
    }

    public static int findEvenCount(int[] array) {
        int result = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int findSmallestIndex(int[] array) {
        int smallestElement = array[0];
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
                result = i;
            }
        }
        return result;
    }

    public static int findLargestElement(int[] array) {
        int largestElement = array[0];
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestElement) {
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
        for (int element : array) {
            if (flagForNegativeElement) {
                elementSum += element;
                counter++;
            }
            if (element < 0 && !flagForNegativeElement) {
                flagForNegativeElement = true;
            }
        }
        if (!flagForNegativeElement) {
            return 0;
        } else {
            return result = (float) (elementSum / counter);
        }
    }
}







