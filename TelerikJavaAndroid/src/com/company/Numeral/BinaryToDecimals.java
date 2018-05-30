package com.company.Numeral;

import java.util.Scanner;

public class BinaryToDecimals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strBinary=input.nextLine();
        int lenght=strBinary.length();

        int[] numBinary=new int[lenght];
        for (int i = 0; i <lenght ; i++) {
            numBinary[i]=strBinary.charAt(lenght-1-i)-'0';
        }
       //for (int i = 0; i < number.length; i++) {
       //    System.out.println(number[i]);

       //}

        int base=1;
        int numDecimal=0;
        for (int i = 0; i <strBinary.length() ; i++) {
            numDecimal+=numBinary[i]*base;
            base*=2;
        }
        System.out.println(numDecimal);

    }
}
