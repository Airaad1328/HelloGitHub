package com.gmail.clarkin200;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SortedArray {
    public static void main(String[] args) {
        int[] array = new int[15];
        fillArray(array);
        System.out.print("Generated array: ");
        printArray(array);
        System.out.println();
        System.out.print("Sorted array by selection sort: ");
        selectionSort(array);
        printArray(array);
        System.out.println();
        System.out.print("Input your value ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (binarySearch(array, input) != 0) {
            System.out.println("Index of number: " + input + " in sorted array: " + binarySearch(array, input));
        } else {
            System.out.println("Number: " + input + " not found");
        }
        System.out.print("Generated array: ");
        fillArray(array);
        printArray(array);
        System.out.println();
        insertionSort(array);
        System.out.print("Sorted array by insertion sort: ");
        printArray(array);
        System.out.println();
        System.out.print("Input your value ");
        input = scanner.nextInt();
        if (binarySearch(array, input) != 0) {
            System.out.println("Index of number: " + input + " in sorted array: " + binarySearch(array, input));
        } else {
            System.out.println("Number: " + input + " not found");
        }

    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
