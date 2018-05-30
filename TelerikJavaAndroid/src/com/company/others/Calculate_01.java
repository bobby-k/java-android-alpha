package com.company.others;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short n=Short.parseShort(input.nextLine());
        double x= Double.parseDouble(input.nextLine());
        DecimalFormat df=new DecimalFormat("0.00000");
        BigDecimal sum=new BigDecimal("1");
        BigDecimal powerX=new BigDecimal("1");
        BigDecimal division=new BigDecimal("1");
        BigDecimal fact=new BigDecimal("1");

            for (int count = 1; count <=n ; count++) {

                fact=fact.multiply(BigDecimal.valueOf(count));
                powerX=powerX.multiply(BigDecimal.valueOf(x));
                division=fact.divide(powerX,20,RoundingMode.HALF_UP);
                sum=sum.add(division);


            }

        System.out.println(df.format(sum));

    }
}
