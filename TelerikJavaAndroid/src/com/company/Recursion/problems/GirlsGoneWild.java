package com.company.Recursion.problems;

import java.util.Arrays;
import java.util.Scanner;


public class GirlsGoneWild {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        String letters=input.nextLine();
        int people= Integer.parseInt(input.nextLine());

        int[]numbers=generateNumber(n);
        char[]chars=sortLetter(letters);
        //printLetter(generateLetter(letters));
        generateComb(numbers,chars,n);





    }

    private static void generateComb(int[] numbers, char[] chars, int n) {
        String[]combinations=new String[n];
        generateComb(numbers,chars,1);
    }

    private static void generateComb(int[] numbers, char[] chars,String[]combinations, int index, int limit) {
        if(index==combinations.length){
            printCombs();
        }else{
            for (int i = limit; i <combinations.length ; i++) {
                for (int j = 0; j < 6; j++) {
                    
                }

            }
        }
    }

    private static void printCombs() {

    }


    private static int[] generateNumber(int n) {
        int[]numbers=new int[n];
        for (int index = 0; index < n; index++) {
            numbers[index]=index;
        }

        //System.out.println();
        return numbers;
    }

    private static void printLetter(char[] chars) {
        for (char aChar : chars) {
                System.out.print( aChar+" ");
        }
        System.out.println();

    }

    private static char[] sortLetter(String letters) {
        char[]sorted=new char[letters.length()];
        for (int index = 0; index <letters.length() ; index++) {
           sorted[index] =letters.charAt(index);
        }
        Arrays.sort(sorted);
        return sorted;
    }
}
