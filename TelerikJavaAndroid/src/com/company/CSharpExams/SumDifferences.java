package com.company.CSharpExams;

import java.util.Scanner;

public class SumDifferences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str=input.nextLine().split(" ");
        int[]numbers=new int[str.length];
        int sum=0;
        for (int i = 0; i <str.length ; i++) {
            numbers[i]=Integer.parseInt(str[i]);
        }
        int[]differs=new int[numbers.length-1];
        for (int i = 0; i <differs.length ; i++) {
            differs[i]=Math.abs(numbers[i+1]-numbers[i]);
        }
        for (int i = 0; i <differs.length ; i++) {
            if(differs[i]%2==0&&differs[i]!=0){
                differs[i+1]=0;
            }
        }
        for (int j = 0; j <differs.length ; j++) {
            if(differs[j]%2==0){
                continue;
            }
            sum+=differs[j];

        }
        System.out.println(sum);


    }
}
