package com.company.ConditionalProblems;

import java.util.Scanner;

public class CheckforPlayCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        //char ch=input.nextLine().charAt(0);
        if(str.matches("[23456789JQKA]")||str.matches("10")){
            System.out.printf("yes %s",str);
        }else{
            System.out.printf("no %s",str);

        }

    }
}
