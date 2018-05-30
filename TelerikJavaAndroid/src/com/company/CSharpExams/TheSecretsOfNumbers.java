package com.company.CSharpExams;

import java.util.Scanner;

public class TheSecretsOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputNum=input.nextLine();
        StringBuilder sb=new StringBuilder(inputNum);
        String result="";

        String number=sb.reverse().toString();
        //System.out.println(number);
        long secretSum=0;
        for (int i = 0; i <number.length() ; i++) {
            int pos=i+1;
            int digit = number.charAt(i) - '0';
            if (pos % 2 != 0) {

                secretSum += digit * pos * pos;

            } else if (pos % 2 == 0) {

               secretSum += digit * digit * pos;

            }
        }
        int alphabetNum=26;
        long reminder=secretSum%alphabetNum;
        char[]letters=new char[alphabetNum];
        int counter=0;
        for (char i = 'A'; i <='Z' ; i++) {
            letters[counter]=(char)i;
            counter++;
        }
        long length = secretSum%10;
        if(length!=0) {
            StringBuilder letter = new StringBuilder();
            for (int i = 0; i < length; i++) {
                letter.append(letters[(int) reminder]);
                reminder++;
                if (reminder>alphabetNum-1){
                    reminder=0;
                }
            }

            result = letter.toString();
        }

        System.out.println(secretSum);
        if(length==0){
            result=String.format("%s has no secret alpha-sequence",inputNum);
            System.out.println(result);
        }else{
            System.out.println(result);
        }

    }
}
