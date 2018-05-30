package com.company.Arrays;

import java.util.Scanner;

public class SpellCaster4 {
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
        char[] moves = new char[26];
        int count = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            moves[count] = i;
            count++;
        }
        char[] ch = new char[resultWord.length()];
        for (int i = 0; i <resultWord.length(); i++) {
            ch[i]=resultWord.charAt(i);

        }
        int startIndex=0;
        int endIndex=0;
        String newWord="";
        for (int position = 0; position <ch.length ; position++) {
            for (int moveCount = 0; moveCount <moves.length ; moveCount++) {
                if(ch[position]==moves[moveCount]){
                    endIndex=position+moveCount+1;
                    startIndex=position;
                    while(endIndex>ch.length-1){
                        endIndex=endIndex-ch.length;
                    }

                }

            }if(startIndex<endIndex){
            char[] newCh=new char[ch.length];
            for (int j = 0; j <startIndex ; j++) {
                newCh[position]=ch[j];

            }
               //for (int j = startIndex; j < ; j++) {

               //}

            }

        }

    }
}
