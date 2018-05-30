package com.company.Loops;

import java.util.Scanner;

public class SignalFromSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputStr=input.nextLine();
        int length=inputStr.length();
        String str="";
        char[]ch=new char[length];

       for (int i = 0; i <length ; i++) {
          ch[i]=inputStr.charAt(i);
       }
        for (int i = 1; i < length; i++) {
           if(ch[i-1]==ch[i]){
               ch[i-1]='\u0000';
        }
       }
        for (int i = 0; i <length ; i++) {
            if (ch[i] != '\u0000') {
                str = str + ch[i];
            }
        }
        System.out.print(str);


    }
}


