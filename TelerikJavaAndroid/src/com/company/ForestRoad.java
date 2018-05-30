package com.company;

import java.util.Scanner;

public class ForestRoad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width= Integer.parseInt(input.nextLine());
        int hight=2*width-1;
        for (int row = 0; row <width ; row++) {
            for (int col = 0; col <row ; col++) {
                System.out.printf(".");
            }
            System.out.printf("*");
            for (int col = 0; col <width-row-1 ; col++) {
                System.out.printf(".");

            }
            System.out.println();
        }
        for (int row = 0; row <width-1 ; row++) {
            for (int col = 0; col <width-2-row ; col++) {
                System.out.printf(".");
            }
            System.out.printf("*");
            for (int col = 0; col <=row ; col++) {
                System.out.printf(".");
                
            }
            System.out.println();
            
        }

    }
}
