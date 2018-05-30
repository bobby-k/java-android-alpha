package com.company.Arrays;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());

        writeMatrix(n);

        printMatrix(n);

    }

    private static void printMatrix(int n) {
        int[][]matrix=writeMatrix(n);
        for (int[] numbers : matrix) {
            for (int number : numbers) {
                System.out.print(number+" ");
            }
            System.out.println();
        }

    }


    private static int[][] writeMatrix(int n) {
        Scanner input = new Scanner(System.in);
        int[][]matrix=new int[n][];
        for (int row = 0; row <n ; row++) {
            String[]line=input.nextLine().split(" ");
            for (int col = 0; col <line.length ; col++) {
                matrix[row]=new int[line.length];
                matrix[row][col]=Integer.parseInt(line[col]);

            }

        }
        return matrix;
    }
}
