package com.company;

import java.util.Scanner;

public class probi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int[]numbers=new int[n];
        int count=0;
        for ( int number=0;number<n ; number++) {
            count++;
            numbers[number]=count;

        }
        System.arraycopy(numbers,n-1,numbers,n-2,1);
        for (int i : numbers) {
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
