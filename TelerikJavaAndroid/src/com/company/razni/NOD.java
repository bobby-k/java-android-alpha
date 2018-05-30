package com.company.razni;

import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= Integer.parseInt(input.nextLine());
        int b= Integer.parseInt(input.nextLine());
        //int c= Integer.parseInt(input.nextLine());
        int constA=a;

        int constB=b;
        while(b!=0){
            int oldB=b;
            b=a%b;
            a=oldB;
        }

        int x=constA*constB/(a);
        System.out.println(x);

        }

    }

