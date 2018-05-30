package com.company.ConditionalProblems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1= Double.parseDouble(input.nextLine());
        double num2= Double.parseDouble(input.nextLine());
        double num3= Double.parseDouble(input.nextLine());
        DecimalFormat df=new DecimalFormat("#.####");

        double max=num1;

        if(num1>=num2&&num1>=num3) {
            max = num1;
        }else if(num2>=num3){
            max=num2;
        }else{
            max=num3;
        }
        System.out.print(df.format(max));

    }
}
