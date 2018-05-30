package com.company.MultidimentionalArrays;

import java.util.Scanner;

public class HorsePath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int[][]matrix=new int[n][n];
        int counter=1;
        int[] dRow={-2,-2,-1,-1, 1, 1, 2, 2};
        int[] dCol={-1, 1,-2, 2,-2, 2,-1, 1};
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col]!=0){
                    continue;
                }
                int r=row;
                int c=col;
                while(true){
                    matrix[r][c]=counter;
                    counter++;
                    for (int direction = 0; direction <dCol.length ; direction++) {
                        int nextRow=r+dRow[direction];
                        int nextCol=c+dCol[direction];
                        if(nextCol<0||nextCol>=matrix.length||
                           nextRow<0||nextRow>=matrix.length||
                                matrix[nextRow][nextCol]!=0){
                            continue;
                        }
                        r=nextRow;
                        c=nextCol;
                        break;
                    }
                    if(matrix[r][c]!=0){
                        break;
                    }


                }

            }

        }
        for (int row = 0; row <n ; row++) {
            for (int col = 0; col <n-1 ; col++) {
                System.out.printf("%d ",matrix[row][col]);

            }
            System.out.print(matrix[row][n-1]);
            System.out.println();

        }


    }
}
