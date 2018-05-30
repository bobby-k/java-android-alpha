package com.company.others;

import java.math.BigInteger;
import java.util.Scanner;

public class CatalanNum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int doubleNValue=2*n;
        int nValue=n;
        int numberOfIterations=n-1;
        BigInteger calatanNum=new BigInteger("1");
        BigInteger fact2N=new BigInteger("1");
        BigInteger factN=new BigInteger("1");
        for (int i = 0; i <numberOfIterations ; i++) {
            fact2N=fact2N.multiply(BigInteger.valueOf(doubleNValue));
            doubleNValue--;
            factN=factN.multiply(BigInteger.valueOf(nValue));
            nValue--;
        }
        calatanNum=fact2N.divide(factN);
        System.out.println(calatanNum);

    }
}
