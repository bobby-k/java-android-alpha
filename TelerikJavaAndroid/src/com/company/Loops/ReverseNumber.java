package com.company.Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputStr= input.nextLine();
        String str="";
        int length=inputStr.length();
        char[] ch=new char[length];
        for (int i = 0; i < length; i++) {
            ch[i]=inputStr.charAt(i);
        }
        for (int i = length-1; i >=0 ; i--) {
            str+=String.valueOf(ch[i]);

        }
        System.out.println(str);

    }
}
