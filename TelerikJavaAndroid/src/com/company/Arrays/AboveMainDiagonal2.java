package com.company.Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class AboveMainDiagonal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        BigInteger cell=new BigInteger("1");
        BigInteger sum=new BigInteger("0");

        for (int row = 0; row <n ; row++) {
            cell=calculateCell(row);
            for (int col=row ;col<n ; col++) {
                sum=sum.add(cell);
                cell=cell.multiply(BigInteger.valueOf(2));


            }
        }
        System.out.println(sum);

    }

    private static BigInteger calculateCell(int row) {
        BigInteger value=BigInteger.valueOf(1);
        for (int i = 0; i <row ; i++) {
            value=value.multiply(BigInteger.valueOf(4));
        }
        return value;
    }
}
