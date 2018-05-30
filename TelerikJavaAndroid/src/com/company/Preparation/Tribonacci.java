package com.company.Preparation;

import java.math.BigInteger;
import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger f0 = BigInteger.valueOf(Integer.parseInt(input.nextLine()));
        BigInteger f1 = BigInteger.valueOf(Integer.parseInt(input.nextLine()));
        BigInteger f2 = BigInteger.valueOf(Integer.parseInt(input.nextLine()));
        int n = Integer.parseInt(input.nextLine());
        if (n == 1) {
            System.out.println(f0);
        }
        else if (n == 2) {
            System.out.println(f1);
        }
        else if (n == 3) {
            System.out.println(f2);
        } else {
            for (int i = 3; i < n; i++) {
                BigInteger fNext = f0.add(f1).add(f2);
                f0 = f1;
                f1 = f2;
                f2 = fNext;

            }
            System.out.println(f2);


        }

    }
}

