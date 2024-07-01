package com.gmail.clarkin200;

import java.util.concurrent.ThreadLocalRandom;

public class MatrixWork {
    public static void main(String[] args) {
        /*int[][] matrix = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };*/
        int[][] matrix = new int[4][4];
        fillMatrix(matrix);
        printMatrix(matrix);
        int sumOfEvenRow = 0;
        int sumOfOddRow = 0;
        long prodOfEvenCol = 1;
        long prodOfOddCol = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0 || i == 0) {
                    sumOfEvenRow += matrix[i][j];
                } else {
                    sumOfOddRow += matrix[i][j];
                }
                if (j % 2 == 0 || j == 0) {
                    prodOfEvenCol *= matrix[i][j];
                } else {
                    prodOfOddCol *= matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of elements in even rows: " + sumOfEvenRow);
        System.out.println("Sum of elements in odd rows: " + sumOfOddRow);
        System.out.println("Product of elements in even columns: " + prodOfEvenCol);
        System.out.println("Product of elements in odd columns: " + prodOfOddCol);
        if (checkMagicSquare(matrix)) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }

    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 51);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkMagicSquare(int[][] matrix) {
        int sumOfElement = 0;
        int bufferRows = 0;
        int bufferDiagonal = 0;
        int bufferCol = 0;
        int bufferReverseDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    sumOfElement += matrix[i][j];
                }
                bufferRows += matrix[i][j];
            }
            if (bufferRows != sumOfElement) {
                return false;
            }
            bufferRows = 0;
        }

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[j].length; i++) {
                bufferCol += matrix[i][j];
            }
            if (bufferCol != sumOfElement) {
                return false;
            }
            bufferCol = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    bufferDiagonal += matrix[i][j];
                }
            }
        }
        if (bufferDiagonal != sumOfElement) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length - i - 1 == j) {
                    bufferReverseDiagonal += matrix[i][j];
                }
            }
        }
        if (bufferReverseDiagonal != sumOfElement) {
            return false;
        }
        return true;
    }

}
