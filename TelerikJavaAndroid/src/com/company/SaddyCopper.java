package com.company;

import java.util.Scanner;
//9223372036854775807
//2613994514047494

public class SaddyCopper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        long num =Long.parseLong(n);
        int sum = 0;
        long product=1;
        int count=0;
        int lenght=n.length();

        for (int i = 0; i < 10; i++) {

            while(true) {
                num = num / 10;
                if(num==0){
                    break;
                }
                lenght--;
                for (int j = 0; j < lenght; j += 2) {
                    sum += n.charAt(j)-'0';
                }
                product*=sum;
                sum=0;
            }
            num=product;
            count++;
            n=""+num;
            lenght=n.length();
            if(lenght==1){
                break;
            }
                product=1;
        }
        if(lenght==1) {
            System.out.println(count);
            System.out.println(num);
        } else{
            System.out.println(num);
        }
    }
}
