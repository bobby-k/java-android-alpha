package com.company.Loops;

import java.util.Scanner;

public class AppearanceCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int[]numbers=new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i]= Integer.parseInt(input.next());
        }
        int x= Integer.parseInt(input.next());
        System.out.println(ContainNum(x,numbers));

    }
    public static int ContainNum(int num,int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                count++;
            }
        }return count;

    }
}
