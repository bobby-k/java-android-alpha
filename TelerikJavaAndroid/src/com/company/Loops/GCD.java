package com.company.Loops;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= Integer.parseInt(input.next());
        int b= Integer.parseInt(input.next());
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);

    }
}
