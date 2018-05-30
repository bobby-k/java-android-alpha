package com.company.ConditionalProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class KaspichanNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        Long num=Long.parseUnsignedLong(str);
        String[] digit=new String[256];
        int counter=0;
        String result="";
        for (char i = 'A'; i <='Z' ; i++) {
            digit[counter]=String.valueOf(i);
            counter++;
        }
        for (char i = 'a'; i <='i'; i++) {
            for (char j = 'A'; j <='Z' ; j++) {
                digit[counter]=""+String.valueOf(i)+String.valueOf(j);
                if(counter==255){
                    break;
                }counter++;
            }
            if(counter==255){
                break;
            }
        }
      //for (int i = 0; i <256; i++) {
      //    System.out.print(digit[i]+" ");
      //}
        if(num==0){
            result="A";
        }
        while(num!=0){
            result = digit[(int)(num % 256)]+result;
            num = num/256;
        }
        System.out.print(result);

        }

    }

