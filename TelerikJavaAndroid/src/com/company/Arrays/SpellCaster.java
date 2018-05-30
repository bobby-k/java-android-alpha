package com.company.Arrays;

import java.util.Scanner;

public class SpellCaster {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String str=input.nextLine();
       //StringBuilder sb=new StringBuilder(str);
       String[] splitStr=str.split("\\s+");
       int max=splitStr[0].length();
       for (int i = 1; i < splitStr.length; i++) {
           if (splitStr[i].length() > max) {
               max = splitStr[i].length();
           }
       }
       String extractStr="";

            for (int j = 0; j <splitStr.length ; j++) {
                for (int i = max - 1; i >= 0; i--) {
                    extractStr += splitStr[j].charAt(i);
                }
            }
        System.out.println(extractStr);









        }

    }

