package com.gmail.clarkin200;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MethodWork {
    public static void main(String[] args) {
        Scanner scannerNum = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputInt = scannerNum.nextInt();
        System.out.println("The square of the number " + inputInt + " is equal to " + squiringNumber(inputInt));

        System.out.print("Enter an radius: ");
        double inputRadius = scannerNum.nextDouble();
        System.out.print("Enter an height: ");
        double inputHeight = scannerNum.nextDouble();
        System.out.println("Volume of a cylinder with radius " + inputRadius + " and height " + inputHeight + " equals " + cylinderVolume(inputRadius, inputHeight));

        System.out.print("Enter the number of array elements: ");
        int arrSize = scannerNum.nextInt();
        int[] arr = new int[arrSize];
        fillArr(arr);
        System.out.print("Array of numbers: ");
        printArr(arr);
        System.out.println();
        System.out.println("The sum of all array elements is equal: "+ arrraySum(arr));

        System.out.print("Enter the line: ");
        String inputLine = scannerString.nextLine();
        System.out.println("Row in reverse order: " + reverseString(inputLine));

        System.out.print("Enter a: ");
        int a = scannerNum.nextInt();
        System.out.print("Enter b: ");
        int b = scannerNum.nextInt();
        System.out.println("The result "+a+"^"+b+" is " + pow(a, b));
        System.out.print("Enter an integer n: ");
        int n = scannerNum.nextInt();
        System.out.print("Enter a text string: ");
        String text = scannerString.nextLine();
        printLine(n, text);

    }

    public static void fillArr(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            arr[i] = ThreadLocalRandom.current().nextInt(1, 51);
        }
    }

    public static void printArr(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static int squiringNumber(int num) {
        return num * num;
    }

    public static double cylinderVolume(double radius, double height) {
        return 3.14 * radius * 2 * height;
    }

    public static int arrraySum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static String reverseString(String input) {
        String resultString = "";
        char[] charArray = input.toCharArray();

        for (int i = input.length() - 1; i >= 0; i--) {
            resultString += charArray[i];
        }
        return resultString;
    }

    public static int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void printLine(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
