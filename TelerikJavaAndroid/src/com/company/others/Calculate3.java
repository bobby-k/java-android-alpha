package com.company.others;

import java.util.Scanner;

public class Calculate3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short n=Short.parseShort(input.nextLine());
        short k=Short.parseShort(input.nextLine());
        int diffNK=n-k;
        long factN=1;
        do {factN=factN*n;
        n--;
        }while(n>1);
        //System.out.println(fact);
        long factK=1;
        do {factK=factK*k;
            k--;
        }while(k>1);
        long factDiff=1;

        do {factDiff=factDiff*diffNK;
            diffNK--;
        }while(diffNK>1);
        long expression=factN/(factK*factDiff);
        System.out.println(expression);



    }
}
