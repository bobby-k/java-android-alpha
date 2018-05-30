package com.company.Loops;

import java.util.Scanner;

public class MatrixOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());

        for (int i = 0; i <n ; i++) {
          int count=i+1;
            for (int j = 0; j <n ; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();

        }

    }
}
