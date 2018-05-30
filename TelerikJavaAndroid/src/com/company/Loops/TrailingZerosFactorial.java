package com.company.Loops;

import java.util.Scanner;

public class TrailingZerosFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int count=0;
        for (int divider = 5; n/divider >=1 ; divider*=5) {
            count+=n/divider;

        }
        System.out.println(count);

        }

    }

