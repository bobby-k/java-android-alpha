package com.company.others;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CatalanNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        DecimalFormat df=new DecimalFormat("0");

        BigDecimal catalanNum=new BigDecimal("1");
        int numberOfIterations=n-1;
        int doubleNValue=2*n;
        int nValue=n;


        for (int i = 0; i <numberOfIterations ; i++) {
            catalanNum=catalanNum.multiply(BigDecimal.valueOf(doubleNValue));
            catalanNum=catalanNum.divide(BigDecimal.valueOf(nValue));
            doubleNValue--;
            nValue--;


        }
        System.out.println(df.format(catalanNum));

    }
}
