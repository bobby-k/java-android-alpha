package com.company.CSharpExams;

import java.util.Scanner;

public class SaddyKopper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n=input.nextLine();
        int count=0;
        long product=1;
        int sum=0;
        boolean breakPoint=false;
        int length=n.length();

        for (int i = 0; i <10 ; i++) {

            while(true){
            n=n.substring(0,length-1);
                //System.out.println(n);
            length--;
            if(length==0){
                break;
            }
            for (int j = 0; j <length ; j+=2) {
                sum+=n.charAt(j)-'0';
            }
            product*=sum;
            sum=0;
            }
            n=""+product;
            count++;
            if(product<10){
                break;
            }
            length=n.length();
            product=1;

        }
        if(n.length()==1){
            System.out.println(count);
            System.out.println(n);
        }else{
            System.out.println(n);
        }

    }
}

