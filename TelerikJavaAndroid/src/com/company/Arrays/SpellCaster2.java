package com.company.Arrays;

import java.util.Scanner;

public class SpellCaster2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputWords=input.nextLine().split(" ");
        String result=getLastLetter(inputWords);
        System.out.println(result);

    }
    private static String getLastLetter(String[] arr){
        String word="";
        String output="";
        for (int i = 0; i <arr.length ; i++) {
            word=""+arr[i];
            output+=word.charAt(word.length()-1);
        }
        return output;

    }
}
