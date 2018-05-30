package com.company.others;

import java.math.BigInteger;
import java.util.Scanner;

public class CalculateAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int k = Integer.parseInt(input.nextLine());
        BigInteger expression = new BigInteger("1");
        int limit = n - k;
        for (int count = 0; count < limit; count++) {
            expression = expression.multiply(BigInteger.valueOf(n));
            n--;


        }
        System.out.println(expression);


    }
}
