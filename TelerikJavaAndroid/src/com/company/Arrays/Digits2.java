package com.company.Arrays;

import java.util.Scanner;

public class Digits2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[][] matrix = new int[n][n];
        for (int row = 0; row < n; row++) {
            String[] line = input.nextLine().split(" ");
            for (int col = 0; col < line.length; col++) {
                int number=Integer.parseInt(line[col]);
                matrix[row][col] = number;
            }
        }

        for (int[] numbers : matrix) {
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

}
