package com.company.ConditionalProblems;

import java.util.Scanner;

public class LeastMajorityMultiple2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= Integer.parseInt(input.nextLine());
        int b= Integer.parseInt(input.nextLine());
        int c= Integer.parseInt(input.nextLine());
        int d= Integer.parseInt(input.nextLine());
        int e= Integer.parseInt(input.nextLine());
        int count=0;
        int lowestMultiply=3;
        while(count<3){
            count=0;
            lowestMultiply++;
            if(lowestMultiply%a==0){
                count++;
            }if(lowestMultiply%b==0){
                count++;
            }if(lowestMultiply%c==0){
                count++;
            }if(lowestMultiply%d==0){
                count++;
            }if(lowestMultiply%e==0){
                count++;
            }

        }
        System.out.println(lowestMultiply);

    }
}
