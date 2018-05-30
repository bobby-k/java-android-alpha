package com.company.ConditionalProblems;

import java.util.Scanner;

public class IntDoubleString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        switch (str){
            case "integer":
                int integerNum= Integer.parseInt(input.nextLine());
                integerNum++;
                System.out.println(integerNum);
                break;

            case "real" :
                double doubleNum= Double.parseDouble(input.nextLine());
                doubleNum++;
                System.out.printf("%.2f",doubleNum);
                break;
            case "text":
                String text=input.nextLine();
                text+="*";
                System.out.println(text);

        }

    }
}
