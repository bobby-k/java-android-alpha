package com.company.CSharpExam;

import java.util.Scanner;

public class HiddenMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String decodeMessage="";
        int symbolNew=0;

        while(true) {
            String indexStr = input.nextLine();
            if(indexStr.equalsIgnoreCase("end")){
                System.out.println(decodeMessage);
                break;
            }else{
            int index=Integer.parseInt(indexStr);
            int symbol = Integer.parseInt(input.nextLine());
            String message = input.nextLine();
            int length=message.length();
            if (index < length && index >= 0) {
                decodeMessage += message.charAt(index);
                if (symbol >= 0) {

                    while (index + symbolNew <=length-1) {
                        symbolNew = symbol;
                        decodeMessage += message.charAt(index + symbolNew);
                        symbolNew += symbol;

                    }
                } else if (symbol < 0) {
                    symbolNew += symbol;
                    while (index + symbolNew >= 0) {
                        decodeMessage += message.charAt(index + symbolNew);
                    }
                }
            } else if (index < 0) {
                decodeMessage += message.charAt(length +index);
                if (symbol >= 0) {
                    while (length + index + symbolNew < length) {
                        symbolNew += symbol;
                        decodeMessage += message.charAt(length + index + symbolNew);
                    }
                }else if(symbol<0){
                        while(length+index+symbolNew>=0){
                            symbolNew += symbol;
                            decodeMessage+=message.charAt(length+index+symbolNew);

                        }
                    }
                }

            }
        }


    }
}
