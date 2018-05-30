package com.company.Numeral;

import java.util.Scanner;

public class BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte digit=Byte.parseByte(input.nextLine());
        int n= Integer.parseInt(input.nextLine());
        int count=0;
        for (int i = 0; i <n ; i++) {
            long num=Long.parseLong(input.nextLine());
            while(num>0){
               if (num%2==digit){
                   count++;
               }num/=2;
            } System.out.println(count);
            count=0;

        }

    }
}
