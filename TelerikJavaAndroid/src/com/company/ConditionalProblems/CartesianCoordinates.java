package com.company.ConditionalProblems;

import java.util.Scanner;

public class CartesianCoordinates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x= Double.parseDouble(input.nextLine());
        double y= Double.parseDouble(input.nextLine());


         if(x==0&&y==0){
            System.out.printf("0");
        }else if(x==0){
            System.out.printf("5");
        }else if(y==0){
            System.out.printf("6");
        }else if(x>0&&y>0) {
             System.out.printf("1");
        }else if(x>0&&y<0) {
            System.out.printf("4");
        }else if(x<0&&y>0) {
            System.out.printf("2");
        }else if(x<0&&y<0) {
            System.out.printf("3");
        }
    }
}
