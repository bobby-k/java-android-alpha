package com.company.Preparation;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score= input.nextInt();
         if(score>=1&&score<=3){
            System.out.print(score*10);
        }else if(score>=4&&score<=6){
            System.out.print(score*100);
        }else if(score>=7&&score<=9){
            System.out.print(score*1000);
        }else{
            System.out.printf("Invalid score");
        }



    }
}
