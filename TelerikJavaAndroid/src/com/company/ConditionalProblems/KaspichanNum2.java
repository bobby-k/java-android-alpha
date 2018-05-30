package com.company.ConditionalProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class KaspichanNum2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            BigInteger num=new BigInteger(input.nextLine());
            String[] digit=new String[256];
            int counter=0;
            String result="";
            for (char i = 'A'; i <='Z' ; i++) {
                digit[counter]=String.valueOf(i);
                counter++;
            }
            for (char i = 'a'; i <='i'; i++) {
                for (char j = 'A'; j <='Z' ; j++) {
                    digit[counter]=""+String.valueOf(i)+String.valueOf(j);
                    if(counter==255){
                        break;
                    }counter++;
                }
                if(counter==255){
                    break;
                }
            }
            //for (int i = 0; i <256; i++) {
            //    System.out.print(digit[i]+" ");
            //}
            BigInteger zero=new BigInteger("0");
            BigInteger divider=new BigInteger("256");
            if(num.compareTo(zero)==0){
                result="A";
            }
            while(!(num.compareTo(zero)==0)){
                BigInteger indexB=num.remainder(divider);
                String indexS=indexB.toString();
                int index=Integer.parseInt(indexS);

                result = digit[index]+result;
                num = num.divide(divider);

            }
            System.out.print(result);

        }

    }

