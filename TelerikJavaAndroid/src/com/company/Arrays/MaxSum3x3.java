package com.company.Arrays;

import java.util.Scanner;

public class MaxSum3x3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        long maxSum = 0;
        long sum = 0;
        int a=0;
        int matrix[][] = new int[n][m];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                matrix[row][col] = input.nextInt();

            }
        }
        maxSum = matrix[0][0] + matrix[0][1] + matrix[0][2] +
                matrix[1][0] + matrix[1][1] + matrix[ 1][2] +
                matrix[2][0] + matrix[2][1] + matrix[2][2];

            for (int row = 0; row < matrix.length - 2; row++) {
                for (int col = 0; col < matrix[row].length - 2; col++) {
                    sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                            matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                            matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }

                }

            }
            System.out.println(maxSum);
        }
    }

