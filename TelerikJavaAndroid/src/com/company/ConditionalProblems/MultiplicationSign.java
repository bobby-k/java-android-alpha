package com.company.ConditionalProblems;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1=input.nextLine();
        String num2=input.nextLine();
        String num3=input.nextLine();
        if(num1.equals("0")||num2.equals("0")||num3.equals("0")){
            System.out.printf("0");
        }
        else if(num1.contains("-")&&num2.contains("-")&&!num3.contains("-")||
                num3.contains("-")&&num1.contains("-")&&!num2.contains("-")||
                num3.contains("-")&&num2.contains("-")&&!num1.contains("-")) {
            System.out.printf("+");
        }else if(num1.contains("-")&&!num2.contains("-")&&!num3.contains("-")||
                num3.contains("-")&&!num1.contains("-")&&!num2.contains("-")||
                num2.contains("-")&&!num3.contains("-")&&!num1.contains("-")||
                num2.contains("-")&&num3.contains("-")&&num1.contains("-")){
            System.out.printf("-");

        }else{
            System.out.printf("+");
        }

    }
}
