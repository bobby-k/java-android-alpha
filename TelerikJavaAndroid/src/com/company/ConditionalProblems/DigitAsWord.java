package com.company.ConditionalProblems;

import java.util.Scanner;

public class DigitAsWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str =input.nextLine();
        try {
            int num = Integer.parseInt(str);

            String word = "";
            switch (num) {
                case 0:
                    word = "zero";
                    break;
                case 1:
                    word = "one";
                    break;
                case 2:
                    word = "two";
                    break;
                case 3:
                    word = "three";
                    break;
                case 4:
                    word = "four";
                    break;
                case 5:
                    word = "five";
                    break;
                case 6:
                    word = "six";
                    break;
                case 7:
                    word = "seven";
                    break;
                case 8:
                    word = "eight";
                    break;
                case 9:
                    word = "nine";
                    break;
                default:
                    word = "not a digit";
            }
            System.out.println(word);

        } catch (Exception e) {
            System.out.println("not a digit");
        }
    }
}
