package com.company.Loops;

import java.math.BigInteger;
import java.util.Scanner;

public class prTrailingZerosFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        BigInteger fact=new BigInteger("1");
        int count=0;
        do{
            fact=fact.multiply(BigInteger.valueOf(n));
            n--;
        }while(n>1);
        String str=fact.toString();
        for (int i = str.length()-1; i >0 ; i--) {
            if(str.charAt(i)=='0'){
                count++;
            }else{
                break;
            }

        }
        System.out.println(str);
        System.out.println(count);
    }
}
