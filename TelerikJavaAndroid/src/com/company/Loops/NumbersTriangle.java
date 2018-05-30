package com.company.Loops;

import java.util.Scanner;

public class NumbersTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        for (int col = 1; col <=n ; col++) {
            for (int row = 1; row <=col ; row++) {
                System.out.print(row);
            }
            System.out.println();

        }
        for (int col = 1; col <n ; col++) {
            for (int row = 1; row <=n-col ; row++) {
                System.out.print(row);

            }
            System.out.println();

        }

    }
}
