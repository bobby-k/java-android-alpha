package com.company.CSharpExams;

import java.util.Scanner;

public class HiddenMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String decoded="";

        while(true){
            String strIndex=input.nextLine();
            int symNew=0;
            if(strIndex.equalsIgnoreCase("end")){
                System.out.println(decoded);

            }else{
                int index=Integer.parseInt(strIndex);
                int sym= Integer.parseInt(input.nextLine());
                String message=input.nextLine();
                int length=message.length();
                 if(index>=0&&index<length){
                     decoded+=""+message.charAt(index);
                     if(sym>=0) {
                         symNew = sym;
                         while (index + symNew < length) {
                             decoded += message.charAt(index + symNew);
                             symNew += sym;
                             if(symNew==0){
                                 break;
                             }
                         }
                     }else if(sym<0){
                             symNew=sym;
                             while(index+symNew>=0){
                                 decoded+=message.charAt(index+symNew);
                                 symNew+=sym;
                             }

                         }
                     }else if(index<0&&length+index>=0){
                     decoded+=""+message.charAt(length+index);
                     if(sym>=0){
                         symNew=sym;
                         while(length+index+symNew<length&&
                                 length+index+symNew>=0){
                             decoded+=""+message.charAt(length+index+symNew);
                             symNew+=sym;
                         }
                     }else if(sym<0){
                         symNew=sym;
                         while(length+index+symNew>=0){
                             decoded+=""+message.charAt(length+index+symNew);
                             symNew+=sym;
                         }

                     }



                 }
                 }

            }
        }


    }
