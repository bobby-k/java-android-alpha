package com.company.Preparation;

import java.util.Scanner;

public class BullsCows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guessNum=input.nextLine();
        int bulls= Integer.parseInt(input.nextLine());
        int cows= Integer.parseInt(input.nextLine());
        int[]guessNumber=new int[4];
        int[]guessNumberCopy=new int[4];

        int[] digits=new int[4];
        String result="";
        int deleted=-1;
        boolean isEmpty=true;
        for (int i = 0; i <guessNum.length() ; i++) {
            guessNumber[i]=guessNum.charAt(i)-'0';
            guessNumberCopy[i]=guessNumber[i];
        }
        for (int number = 1111; number <9999 ; number++) {
            int bullCount=0;
            int cowCount=0;

            int digit=number;
            for (int i = 3; i >=0 ; i--) {
                digits[i]=digit%10;
                digit/=10;
                if(digits[i]==0){
                    break;
                }
            }
            if(digits[0]==0||digits[1]==0||digits[2]==0||digits[3]==0){
                continue;
            }

        for (int i = 0; i <4 ; i++) {
            guessNumberCopy[i]=guessNumber[i];
            if (digits[i] == guessNumberCopy[i]) {
                bullCount++;
                digits[i] =0;
                guessNumberCopy[i]=deleted;
            }
        }
            for (int j = 0; j <4 ; j++) {
                if(digits[j]==0){
                    continue;
                }
                for (int k = 0; k <4 ; k++) {
                    if(guessNumberCopy[k]==deleted){
                        continue;
                    }
                    if(digits[j]==guessNumberCopy[k]){
                        cowCount++;
                }
            }
        }

        if(bullCount==bulls&&cowCount==cows){
                isEmpty=false;
                result+=number+" ";
        }

        }
        if(isEmpty){
            System.out.printf("No");
        }else{
            System.out.print(result);
        }



    }
}
