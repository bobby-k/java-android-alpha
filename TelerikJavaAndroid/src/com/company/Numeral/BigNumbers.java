package com.company.Numeral;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int length1= input.nextInt();
         int length2= input.nextInt();


         int[] arrStr1=new int[length1];
        for (int i = 0; i <length1 ; i++) {
            arrStr1[i]=input.nextByte();
        }

        int[] arrStr2=new int[length2];
        for (int i = 0; i <length2 ; i++) {
            arrStr2[i]=input.nextByte();
        }

        int maxL=Math.max(length1,length2);
        String resultStr="";
        StringBuilder sb=new StringBuilder(resultStr);
        byte num=0;
        for (int i = 0; i <maxL; i++) {
            if(i<length1){
                 num+=arrStr1[i];
            }
            if(i<length2){
                num+=arrStr2[i];
            }
            sb.append(num%10);
            if(num>9){
                num=1;
            }else{
                num=0;
            }

        }resultStr=sb.toString();
        System.out.println(resultStr);


    }
}
