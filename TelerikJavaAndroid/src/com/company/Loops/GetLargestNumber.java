package com.company.Loops;

import java.util.Scanner;

public class GetLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1= Integer.parseInt(input.next());
        int num2= Integer.parseInt(input.next());
        int num3= Integer.parseInt(input.next());
        int max=GetMax(num1,num2);
        max=GetMax(max,num3);

        System.out.println(max);

    }
    private static int GetMax(int a,int b){
        int max=Integer.MIN_VALUE;
        if(a>=b){
            return a;
        }else{
           return b;
        }

    }
}
