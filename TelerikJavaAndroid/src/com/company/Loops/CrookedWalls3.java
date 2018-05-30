package com.company.Loops;

import java.util.Scanner;

public class CrookedWalls3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();



        String[] splited = str.split("\\s");
        int n = splited.length;
        long[] index = new long[n - 1];
        long sum =0;

        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(splited[i]);
        }
            for (int i = 0; i < n - 1; i++) {

                index[i]=Math.abs(arr[i]-arr[i+1]);
               //System.out.println(index[i]);
            }

        for (int i = 0; i <n-2 ; i++) {

            if (index[i] % 2 == 0&&index[i]!=0) {
                index[i + 1] = 0;
            }
        }
        for (int i = 0; i <n-1 ; i++) {

            //System.out.println(index[i]);
            if (index[i] % 2 == 0) {
                sum+=index[i];

            }

        }
        System.out.println(sum);

        }
    }
