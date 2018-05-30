package com.company;

import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int width=2*n;
        int hight=n+1;
        int dotCount=n;
        System.out.printf("%s%s%s%s%n",
                repeatText(".",dotCount),
                repeatText("*",1),
                repeatText("*",width-2-dotCount),
                repeatText("*",1));
        dotCount--;
        for (int row = 1; row <hight-1 ; row++) {
            System.out.printf("%s%s%s%s%n",
                    repeatText(".",dotCount),
                    repeatText("*",1),
                    repeatText(".",width-2-dotCount),
                    repeatText("*",1));
            dotCount--;

        }
        System.out.printf("%s%s%s%s%n",
                repeatText(".",dotCount),
                repeatText("*",1),
                repeatText("*",width-2-dotCount),
                repeatText("*",1));

    }
    public static String repeatText(String text,int count){
        String repeatT="";
        for (int i = 0; i <count ; i++) {
            repeatT+=text;
        }return repeatT;
    }

}
