package com.company.Loops;

import java.util.Scanner;

public class GoodNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int count=0;

        for (int number = n; number <=m ; number++) {
            int divider=number;
            int digit=divider%10;

            boolean isTrue=true;
            while(divider!=0) {
                if (digit!=0&&number % digit != 0) {
                    isTrue = false;
                    break;
                }
                divider/=10;
                digit=divider%10;
            }
                if(isTrue){
                    count++;
                }



            }
        System.out.println(count);

        }

    }

