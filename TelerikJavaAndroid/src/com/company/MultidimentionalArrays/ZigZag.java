package com.company.MultidimentionalArrays;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int[][]matrix=new int[n][m];
        long sum=0;
        for (int row = 0; row <n ; row++) {
            int r=1+row*3;
            matrix[row][0]=r;
            if(matrix[row][0]%2!=0){
                sum+=matrix[row][0];

            }
            for (int col = 1; col <m ; col++) {
                int c=3;
                matrix[row][col]=matrix[row][col-1]+c;
                if(matrix[row][col]%2!=0){
                    sum+=matrix[row][col];
                    if(row!=0&&row!=n-1&&col!=0&&col!=m-1){
                        sum+=matrix[row][col];
                    }
                }
            }

        }
        System.out.println(sum);
      //for (int[] mat:matrix) {
      //    for (int cell:mat) {
      //        System.out.printf("%d ",cell);
      //    }
      //    System.out.println();

      //}

    }
}
