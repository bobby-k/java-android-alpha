package com.company.Loops;

import java.util.Scanner;

public class PaperCutter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= Integer.parseInt(input.nextLine());
        String[] arrS={"A0","A1","A2","A3","A4","A5","A6","A7","A8","A9","A10"};
        int[] arrNum={1024,512,256,128,64,32,16,8,4,2,1};
        int[] quotient=new int[11];
        for (int i = 0; i <11 ; i++) {
            quotient[i]=num/arrNum[i];
            num=num%arrNum[i];
        }
        for (int i = 0; i < 11; i++) {
            if(quotient[i]!=1){
                System.out.println(arrS[i]);
            }

        }


    }
}
