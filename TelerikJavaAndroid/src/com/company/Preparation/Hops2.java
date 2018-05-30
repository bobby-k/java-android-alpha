package com.company.Preparation;

import java.util.Scanner;

public class Hops2 {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                String[] inputString=input.nextLine().split(", ");
                int[] field=new int[inputString.length];
                int[] fieldNew=new int[field.length];
                for (int i = 0; i <inputString.length ; i++) {
                    field[i]=Integer.parseInt(inputString[i]);
                    fieldNew[i]=field[i];
                }

                int m= Integer.parseInt(input.nextLine());
                int carrots=field[0];
                int maxcarrots=field[0];
                int stepIndex=0;
                int index=0;
                for (int i = 0; i < m; i++) {
                    String[] stepStr=input.nextLine().split(", ");
                    int[] step=new int[stepStr.length];
                    for (int j = 0; j <stepStr.length ; j++) {
                        step[j] = Integer.parseInt(stepStr[j]);
                    }
                    stepIndex=0;
                    index=0;
                    for (int k = 0; k <field.length ; k++) {
                        fieldNew[k]=field[k];
                    }
                    carrots=field[0];
                    fieldNew[0]=Integer.MAX_VALUE;
                    while(true){
                        index+=step[stepIndex];
                        if(index<0||index>field.length-1){
                            break;
                        }
                        if(fieldNew[index]==Integer.MAX_VALUE){
                            break;
                        }
                        carrots+=fieldNew[index];
                        stepIndex++;
                        while(stepIndex>step.length-1){
                            stepIndex-=step.length;
                        }
                        while(stepIndex<0){
                            stepIndex+=step.length;
                        }

                        fieldNew[index]=Integer.MAX_VALUE;


                    }
                    maxcarrots=Math.max(carrots,maxcarrots);

                }
                System.out.println(maxcarrots);

            }
        }

