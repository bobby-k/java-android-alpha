package com.company.Preparation;

import java.util.Scanner;

public class TribonacciTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long t0=Long.parseLong(input.nextLine());
        long t1=Long.parseLong(input.nextLine());
        long t2=Long.parseLong(input.nextLine());
        int n= Integer.parseInt(input.nextLine());

        System.out.println(t0);
        System.out.println(String.format("%d %d",t1,t2 ));
        for (int col = 2; col <n ; col++) {
            for (int row = 0; row <=col ; row++) {
                long tNext=t0+t1+t2;
                t0=t1;
                t1=t2;
                t2=tNext;
                System.out.printf("%d ",tNext);
            }
            System.out.println();

        }


    }
}
