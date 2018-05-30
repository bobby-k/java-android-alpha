package com.company.Numeral;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {

                Scanner input = new Scanner( System.in );
                long num =Long.parseLong(input.nextLine());
                String str="";

                // Digits in hexadecimal number system
                char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

                while(num>0)
                {
                    long reminder=num%16;
                    str=hex[(int)reminder]+str;
                    num=num/16;
                }
                System.out.println(str);
            }
        }