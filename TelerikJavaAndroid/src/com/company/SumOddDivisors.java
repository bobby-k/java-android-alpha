package com.company;

import java.util.Scanner;

public class SumOddDivisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= Integer.parseInt(input.nextLine());
        int b= Integer.parseInt(input.nextLine());
        int sum=0;
        for (int number = a; number <=b ; number++) {

            //int maxdivider=(int)Math.sqrt(number);
            int divider=1;
            //boolean isDiv=true;
            while(divider<=number){
                if(number%divider==0&&divider%2!=0){
                    sum+=divider;
                }
                divider++;
            }

        }
        System.out.println(sum);

    }
}
