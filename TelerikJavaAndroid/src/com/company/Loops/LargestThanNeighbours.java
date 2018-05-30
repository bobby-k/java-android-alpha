package com.company.Loops;

import java.util.Scanner;

public class LargestThanNeighbours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int[] numbers=new int[n];
        for (int i = 0; i <n ; i++) {
            numbers[i]=Integer.parseInt(input.next());
          
        }
        System.out.println(IsLargest(numbers));

    }
    public static int IsLargest(int[] arr){
        int count=0;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                count++;
            }
            
        }return count;
        
    }
}
