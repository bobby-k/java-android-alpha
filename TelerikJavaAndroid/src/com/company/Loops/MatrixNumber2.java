package com.company.Loops;

import java.util.Scanner;

public class MatrixNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= Integer.parseInt(input.nextLine());
        int count=0;
        int printNumber=0;
        while(true){
            printNumber++;
            System.out.printf("%d ",printNumber);
            if(printNumber==2*num-1){
                break;
            }
            if(printNumber==num+count){
                count++;
                printNumber=count;
                System.out.println();
                //continue;
            }
        }

    }
}
