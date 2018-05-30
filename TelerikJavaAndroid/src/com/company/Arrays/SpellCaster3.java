package com.company.Arrays;

import java.util.Scanner;

public class SpellCaster3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputStr = input.nextLine().split(" ");

        int maxLength = inputStr[0].length();
        for (int i = 0; i < inputStr.length; i++) {
            if (inputStr[i].length() > maxLength) {
                maxLength = inputStr[i].length();
            }
        }
        String word = "";
        String resultWord = "";

        for (int j = 0; j < maxLength; j++) {
            for (int i = 0; i < inputStr.length; i++) {
                word = "" + inputStr[i];
                if ((word.length() - j - 1) >= 0) {
                    resultWord += word.charAt(word.length() - j - 1);
                }
            }

        }
        //System.out.println(resultWord);
        char[] ch = new char[26];
        int count = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            ch[count] = i;
            count++;
        }
        //for (int i = 0; i <26 ; i++) {
        //    System.out.println(ch[i]);
        //}

        int startIndex=0;
        int endIndex=0;
        String newWord = "";
        int letterCount = 0;
        int length=resultWord.length();
        for (int position = 0; position < length; position++) {
            for (letterCount = 0; letterCount < 26; letterCount++) {
                if (String.valueOf(resultWord.charAt(position)).equalsIgnoreCase(String.valueOf(ch[letterCount]))) {
                        endIndex =letterCount+position+1 ;
                        startIndex=position;
                        while(endIndex>=length){
                            endIndex=endIndex-length;
                        }
                        break;
                    }
                }


                if(startIndex>endIndex){
                newWord=resultWord.substring(0,endIndex)+resultWord.charAt(position)+
                        resultWord.substring(endIndex,startIndex)+resultWord.substring(startIndex+1);
                }
                else if(startIndex<endIndex){
                newWord=resultWord.substring(0,startIndex)+resultWord.substring(startIndex+1,endIndex+1)+
                        resultWord.charAt(position)+resultWord.substring(endIndex+1);
                }
                resultWord = newWord;

            //System.out.println(resultWord);

        }System.out.println(resultWord);
    }
}
