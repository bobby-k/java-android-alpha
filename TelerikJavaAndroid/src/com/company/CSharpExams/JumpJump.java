package com.company.CSharpExams;

import java.util.Scanner;

public class JumpJump {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String instruction=input.nextLine();
        int index=0;
        String result="Fell off the dancefloor at %d!";
        while(index>=0&&index<instruction.length()){
            char ch=instruction.charAt(index);

            if(ch=='^'){
                result="Jump, Jump, DJ Tomekk kommt at %d!";
                break;
            }else {
                int num=ch-'0';
                if(num==0){
                result="Too drunk to go on after %d!";
                break;
                }
                else if((num)%2==0){
                index+=num;
                 }
                 else if(num%2!=0){
                index-=num;
                }
            }
        }
        System.out.println(String.format(result,index));
    }
}

