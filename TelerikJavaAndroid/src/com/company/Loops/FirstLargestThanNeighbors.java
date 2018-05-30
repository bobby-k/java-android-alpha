package com.company.Loops;

import java.util.Scanner;

public class FirstLargestThanNeighbors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        double[] arr=new double[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= Double.parseDouble(input.next());
        }
        int max=0;
        for (int i = 2; i <arr.length ; i++) {
            if(arr[i]<arr[i-1]&&arr[i-2]<arr[i-1]){
                max=i-1;
                break;
            }else{
                max=-1;
            }

        }
        System.out.println(max);

    }
}
