package com.company.Arrays;

import java.util.Scanner;

public class MaxSum3x3New2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short n = input.nextShort();
        short m = input.nextShort();
        short maxSum =Short.MIN_VALUE;
        short sum = 0;
        short matrix[][] = new short[n][m];
        short rowMatrix[][] = new short[n][m-2];
        for (short row = 0; row < n; row++) {
            for (short col = 0; col < m; col++) {
                matrix[row][col] = input.nextShort();

            }
        }
        for (int row = 0; row <n ; row++) {
            sum=0;
            for (int col = 0; col <3 ; col++) {
                sum+=matrix[row][col];
                rowMatrix[row][0]=sum;
            }
            for (int col = 1; col <m-2 ; col++) {
                sum+=(matrix[row][col+2]-matrix[row][col-1]);
                rowMatrix[row][col]=sum;
            }
        }
        for (int col = 0; col <m-2 ; col++) {
            sum=0;
            for (int row = 0; row <3 ; row++) {
                sum+=rowMatrix[row][col];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
            for (int row = 1; row <n-2 ; row++) {
                sum+=(rowMatrix[row+2][col]-rowMatrix[row-1][col]);
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
        }
    }

