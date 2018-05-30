package com.company.MultidimentionalArrays;

import java.util.Scanner;

public class HorseMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        String[][] matrix=new String[n][n];
        for (int row = 0; row <n ; row++) {
            String strRow[]=input.nextLine().split(" ");
            for (int col = 0; col <n ; col++) {
                matrix[row][col]=strRow[col];
            }
        }
        int[]dRow={-1,-2,-2,-1,+1,+2,+2,+1};
        int[]dCol={-2,-1,+1,+2,+2,+1,-1,-2};
        int jumpCount=0;
        int minJumpCont=Integer.MAX_VALUE;

        for (int r = 0; r <n ; r++) {
            for (int c = 0; c <n ; c++) {
                if(matrix[r][c].equalsIgnoreCase("s")) {
                    int row = r;
                    int col = c;

                    while (!matrix[row][col].equals("x")) {

                        if(matrix[row][col].equals("e")){
                            minJumpCont=Math.min(minJumpCont,jumpCount);
                            break;
                        }
                        matrix[row][col]="x";
                        for (int dir = 0; dir < dCol.length; dir++) {
                            int nextRow = row +dRow[dir];
                            int nextCol = col +dCol[dir];
                            if(nextCol<0||nextCol>=n||
                               nextRow<0||nextRow>=n||
                               matrix[nextRow][nextCol].equals("x")){
                                continue;
                            }
                            row=nextRow;
                            col=nextCol;
                            jumpCount++;
                            break;
                        }
                    }
                }

            }

        }
        if(jumpCount==1){
            System.out.printf("No");
        }else{
            System.out.println(jumpCount);
        }
       //System.out.println();
       //for (int row = 0; row <n ; row++) {
       //    for (int col = 0; col <n ; col++) {
       //        System.out.printf("%s ",matrix[row][col]);

       //    }
       //    System.out.println();

        //}

    }
}
