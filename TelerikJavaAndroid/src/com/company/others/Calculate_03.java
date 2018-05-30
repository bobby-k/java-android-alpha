package com.company.others;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculate_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int k= Integer.parseInt(input.nextLine());
        int diff=n-k;
        BigInteger expression=calculateFactoriel(n).divide
                (calculateFactoriel(k).multiply(calculateFactoriel(diff)));
        System.out.println(expression);
    }
    public static BigInteger calculateFactoriel(int x){
        BigInteger factoriel=new BigInteger("1");
        do{factoriel=factoriel.multiply(BigInteger.valueOf(x));
        x--;
        }while(x>1);
        return factoriel;
    }
}
