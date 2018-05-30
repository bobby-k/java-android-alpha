package com.company.Arrays;

import java.util.Scanner;

public class MaxSumKelements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int k= Integer.parseInt(input.nextLine());
        int[]numbers=new int[n];
        boolean[] checked=new boolean[n];
        int sum=0;
        for (int i = 0; i <n ; i++) {
            numbers[i]= Integer.parseInt(input.nextLine());
        }
        for (int j = 0; j <k ; j++) {
        int max=Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i <n ; i++) {
            if(checked[i]){
                continue;
            }
            if (max < numbers[i]) {
                max = numbers[i];
                index=i;
            }
        }
        checked[index]=true;
        sum+=max;


        }
        System.out.println(sum);

    }
}
