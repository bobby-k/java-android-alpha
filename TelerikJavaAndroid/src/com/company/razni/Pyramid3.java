package com.company.razni;

import java.util.Scanner;

public class Pyramid3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());

        for (int i = 0; i <n ; i++) {
            int num=1;
            for (int j = 0; j <=i ; j++) {
                System.out.print(num+" ");
                num++;

            }
            System.out.println();

        }

    }
}
