package com.company.ConditionalProblems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BiggestOfFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1= Double.parseDouble(input.nextLine());
        double num2= Double.parseDouble(input.nextLine());
        double num3= Double.parseDouble(input.nextLine());
        double num4= Double.parseDouble(input.nextLine());
        double num5= Double.parseDouble(input.nextLine());
        DecimalFormat df=new DecimalFormat("#.####");

        double max=num1;
        if(num1>=num2&&num1>=num3&&num1>=num4&&num1>=num5){
            max=num1;
        }else if(num2>=num3&&num2>=num4&&num2>=num5){
            max=num2;
        }else if(num3>=num4&&num3>=num5){
            max=num3;
        }else if(num4>=num5){
            max=num4;
        }else{
            max=num5;
        }
        System.out.println(df.format(max));

    }
}
