package com.company.MultidimentionalArrays;

import java.util.Scanner;

public class SequenceInMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String[]number=input.nextLine().split(" ");
       int n=Integer.parseInt(number[0]);
       int m=Integer.parseInt(number[1]);
        String[][] matrix=new String[n][m];
        String[] matrixCol = input.nextLine().split("\\s+");
        for (int row = 0; row <n ; row++) {
            matrixCol = input.nextLine().split("\\s+");
            for (int col = 0; col <matrixCol.length ; col++) {
                matrix[row][col]=matrixCol[col];
            }
        }
      // for (int row = 0; row <n ; row++) {
      //     for (int col = 0; col <m ; col++) {
      //         System.out.printf("%s ",matrix[row][col]);
      //     } System.out.println();

      // }


    }
}
