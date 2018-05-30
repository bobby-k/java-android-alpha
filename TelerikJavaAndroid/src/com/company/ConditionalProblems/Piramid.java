package com.company.ConditionalProblems;

import java.util.Scanner;

public class Piramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n= Long.parseLong(input.nextLine());
        long count=0;
        while(n>0&&n>n-count-1){
            count++;
            n-=count+1;
        }
        System.out.println(count);

    }
}
