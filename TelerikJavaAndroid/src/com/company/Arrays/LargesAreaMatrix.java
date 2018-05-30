package com.company.Arrays;

import java.util.Scanner;

public class LargesAreaMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int matrix[][]=new int[n][m];
        for (int row = 0; row <n ; row++) {
            for (int col = 0; col <m ; col++) {
                matrix[row][col]=input.nextInt();
            }
        }



    }
}
