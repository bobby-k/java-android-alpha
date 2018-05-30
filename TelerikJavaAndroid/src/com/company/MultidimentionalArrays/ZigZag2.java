package com.company.MultidimentionalArrays;

import java.util.Scanner;

public class ZigZag2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        long sum=0;
        for (int row = 0; row <n ; row++) {
            int number=1+row*3;
            if(number%2!=0){
                sum+=number;

            }
            for (int col = 1; col <m ; col++) {
                int c=3;
                number+=c;
                if(number%2!=0){
                    sum+=number;
                    if(row!=0&&row!=n-1&&col!=m-1){
                        sum+=number;
                    }
                }
            }

        }
        System.out.println(sum);
      //for (int[] mat:matrix) {
      //    for (int cell:mat) {
      //        System.out.printf("%d ",cell);
      //    }
      //    System.out.println();

      //}

    }
}
