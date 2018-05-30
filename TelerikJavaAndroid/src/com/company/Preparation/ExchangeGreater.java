package com.company.Preparation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeGreater{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.####");
        double a= Double.parseDouble(input.nextLine());
        double b= Double.parseDouble(input.nextLine());

        if(a>b){
            double temp=a;
            a=b;
            b=temp;
        }
        System.out.printf("%s %s", df.format(a),df.format(b));


    }
}
