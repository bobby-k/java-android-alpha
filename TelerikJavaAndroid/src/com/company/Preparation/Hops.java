package com.company.Preparation;

import java.util.Arrays;
import java.util.Scanner;

public class Hops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] inputString=input.nextLine().split(", ");
        short[] field=new short[inputString.length];
        for (int i = 0; i <inputString.length ; i++) {
            field[i]=Short.parseShort(inputString[i]);

        }

        short m= Short.parseShort(input.nextLine());
        int carrots=field[0];
        int maxcarrots=Integer.MIN_VALUE;
        int stepIndex=0;
        int index=0;
        for (int i = 0; i < m; i++) {
            String[] stepStr=input.nextLine().split(", ");
            short[] step=new short[stepStr.length];
            for (int j = 0; j <stepStr.length ; j++) {
                step[j] = Short.parseShort(stepStr[j]);
            }
            stepIndex=0;
            index=0;
            boolean[] bool=new boolean[field.length];
            Arrays.fill(bool, Boolean.FALSE);

            carrots=field[0];
            bool[0]=true;
            while(true){
                index+=step[stepIndex];
                if(index<0||index>field.length-1||bool[index]){
                    break;
                }
                carrots+=field[index];
                stepIndex++;
                while(stepIndex>step.length-1){
                    stepIndex-=step.length;
                }
                while(stepIndex<0){
                    stepIndex+=step.length;
                }

                bool[index]=true;

            }
            maxcarrots=Math.max(carrots,maxcarrots);

        }
        System.out.println(maxcarrots);

    }
}
