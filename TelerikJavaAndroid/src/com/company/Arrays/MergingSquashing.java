package com.company.Arrays;

import java.util.Scanner;

public class MergingSquashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int firstNum = Integer.parseInt(input.nextLine());
        String mergeStr="";
        String squashStr="";
        for (int i = 0; i < n - 1; i++) {
            int secondNum = Integer.parseInt(input.nextLine());
            //int mergednum=mergeNum(firstNum,secondNum);
            //System.out.println(mergednum);
            //System.out.println(squashNum(firstNum,secondNum));
             mergeStr+=String.valueOf(mergeNum(firstNum,secondNum))+" ";
             squashStr+=String.valueOf(squashNum(firstNum,secondNum))+" ";
             firstNum=secondNum;

        }
        System.out.println(mergeStr);
        System.out.println(squashStr);
    }

    private static int mergeNum(int a, int b){

        a=a%10;
        b=b/10;
        String merge=String.valueOf(a)+String.valueOf(b);
        int num=Integer.parseInt(merge);
        return  num;
    }
    private static int squashNum(int a,int b){
        int c=(a%10+b/10%10)%10;
        a=a/10%10;
        b=b%10;

        String squash=String.valueOf(a)+String.valueOf(c)+String.valueOf(b);
        int num=Integer.parseInt(squash);
        return num;
    }
}


