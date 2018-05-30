package com.company.Numeral;

import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numHex=input.nextLine();
        long numDecimal=0;
        long base=1;

        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        for (int i = 0; i <numHex.length() ; i++) {
            for (int index = 0; index <hex.length ; index++) {
                if(numHex.charAt(numHex.length()-i-1)==hex[index]){
                    numDecimal+=index*base;
                    base*=16;

                }

            }

        }
        System.out.println(numDecimal);

    }
}
