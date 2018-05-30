package com.company.CSharpExams;

import java.util.Scanner;

public class Mergingnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int firstNum= Integer.parseInt(input.nextLine());

        String mersingNum="";
        String summingNum="";
        for (int i = 0; i <n-1 ; i++) {
            int secondNum= Integer.parseInt(input.nextLine());
            mersingNum+=""+firstNum%10+secondNum/10+" ";
            summingNum+=""+(firstNum+secondNum)+" ";
            firstNum=secondNum;
        }
        System.out.println(mersingNum);
        System.out.println(summingNum);

    }
}
