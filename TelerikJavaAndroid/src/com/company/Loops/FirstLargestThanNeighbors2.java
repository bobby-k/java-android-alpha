package com.company.Loops;

import java.util.Scanner;

public class FirstLargestThanNeighbors2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = Integer.parseInt(input.nextLine());
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]= Integer.parseInt(input.next());
            }
        System.out.println(IsLargest(arr));

    }
    public static int IsLargest(int[] x){
        for (int i = 2; i < x.length; i++) {
            if(x[i-2]<x[i-1]&&x[i-1]>x[i]){
                return i-1;
            }
        }
        return -1;
    }
}
