package com.company.Arrays;

import java.util.Scanner;

public class MaxSum3x3New {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short n = input.nextShort();
        short m = input.nextShort();
        short maxSum =Short.MIN_VALUE;
        short sum = 0;
        short matrix[][] = new short[n][m];
        for (short row = 0; row < n; row++) {
            for (short col = 0; col < m; col++) {
                matrix[row][col] = input.nextShort();

            }
        }


            for (short row = 0; row < matrix.length - 2; row++) {
                for (short col = 0; col < matrix[row].length - 2; col++) {
                    sum = (short)(matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                            matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                            matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2]);
                    if (sum > maxSum) {
                        maxSum = sum;
                    }

                }

            }
            System.out.println(maxSum);
        }
    }

