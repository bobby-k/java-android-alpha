package com.company.ConditionalProblems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1= Double.parseDouble(input.nextLine());
        double num2= Double.parseDouble(input.nextLine());
        double num3= Double.parseDouble(input.nextLine());
        DecimalFormat df=new DecimalFormat("#.####");

        String result="";
        if(num1>=num2&&num1>=num3&&num2>=num3) {
            result=String.format("%s %s %s",df.format(num1),df.format(num2),df.format(num3));
        }else if(num1>=num2&&num1>=num3){
            result=String.format("%s %s %s",df.format(num1),df.format(num3),df.format(num2));
        } else if(num2>=num3&&num1>=num3){
            result=String.format("%s %s %s",df.format(num2),df.format(num1),df.format(num3));
        }else if(num2>=num3){
            result=String.format("%s %s %s",df.format(num2),df.format(num3),df.format(num1));
        }else if(num1>=num2){
            result=String.format("%s %s %s",df.format(num3),df.format(num1),df.format(num2));
        }else{
            result=String.format("%s %s %s",df.format(num3),df.format(num2),df.format(num1));
        }
        System.out.print((result));

    }
}
