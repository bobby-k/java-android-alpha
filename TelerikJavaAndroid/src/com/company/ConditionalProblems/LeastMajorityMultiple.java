package com.company.ConditionalProblems;

import java.util.Scanner;

public class LeastMajorityMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= Integer.parseInt(input.nextLine());
        int b= Integer.parseInt(input.nextLine());
        int c= Integer.parseInt(input.nextLine());
        int d= Integer.parseInt(input.nextLine());
        int e= Integer.parseInt(input.nextLine());

        int LCM;


        for ( LCM = 4; ; LCM++) {
            int count=0;
            if(LCM%a==0){
                count++;
            }if(LCM%b==0){
                count++;
            }if(LCM%c==0){
                count++;
            }if(LCM%d==0){
                count++;
            }if(LCM%e==0){
                count++;
            }if(count>=3){
                break;
            }

        }
        System.out.println(LCM);



    }
}
