package com.company.MultidimentionalArrays;

import java.math.BigInteger;
import java.util.Scanner;

public class BitShiftMatrix {
    private static int r;
    private static int c;
    private static int coef;
    private static BigInteger sum;
    private static boolean[][]visitedMatrix;


    public static void main(String[] args) {
        //read input
        Scanner input = new Scanner(System.in);
        r= Integer.parseInt(input.nextLine());
        c= Integer.parseInt(input.nextLine());
        int moves= Integer.parseInt(input.nextLine());
        String[] directions=input.nextLine().split(" ");

        visitedMatrix=new boolean[r][c];
        sum=new BigInteger("0");
        coef=Math.max(r,c);

        markVisited(moves,directions);
        calculateSum(visitedMatrix);
        //printMatrix(visitedMatrix);
        System.out.println(sum);
    }

    private static void printMatrix(boolean[][] visitedMatrix) {
        for (boolean[] matrix : visitedMatrix) {
            for (boolean bool : matrix) {
                System.out.print(bool+" ");
            }
            System.out.println();
        }
    }

    private static BigInteger calculateSum(boolean[][] visitedMatrix) {
        for (int row = 0; row <r ; row++) {
            for (int col = 0; col <c ; col++) {
                if(visitedMatrix[row][col]){
                    sum=sum.add(BigInteger.valueOf(1).shiftLeft(r-1-row+col));
                    //System.out.println(BigInteger.valueOf(1).shiftLeft(r-1-row+col));
                }
            }
        }
        return sum;
    }

    private static boolean[][] markVisited(int moves, String[] directions) {

        int currentRow=r-1;
        int currentCol=0;
        visitedMatrix[r-1][0]=true;

        for (int move = 0; move<moves ; move++) {

            int target=Integer.parseInt(directions[move]);
            int targetRow=target/coef;
            int targetCol=target%coef;

            while(currentCol!=targetCol) {

                if (currentCol < targetCol) {
                        currentCol++;
                } else if (currentCol > targetCol) {
                        currentCol--;
                }
                visitedMatrix[currentRow][currentCol] = true;
            }
            while(currentRow!=targetRow){

                if(currentRow<targetRow){
                    currentRow++;
                }else if(currentRow>targetRow){
                    currentRow--;
                }
                visitedMatrix[currentRow][currentCol]=true;
            }
        }

        //printMatrix(visitedMatrix);
        return visitedMatrix;
    }
}
