package com.company.CSharpExams;

import java.util.Scanner;

public class drunkenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short rounds=Short.parseShort(input.nextLine());
        long mitkoBeers=0;
        long vladkoBeers=0;
        for (int i = 0; i <rounds ; i++) {
            Long drunkenNum = Long.parseLong(input.nextLine());
            String number = Long.toString(drunkenNum);
            //System.out.println(drunkenNum);
            if (number.length() % 2 == 0) {
                for (int j = 0; j < number.length()/2 ; j++) {
                    mitkoBeers += number.charAt(j) - '0';

                }
                for (int j = number.length() / 2 ; j < number.length(); j++) {
                    vladkoBeers += number.charAt(j) - '0';
                }
            } else if (number.length() % 2 != 0) {
                for (int j = 0; j < number.length() / 2 + 1; j++) {
                    mitkoBeers += number.charAt(j) - '0';
                }
                for (int j = number.length() / 2; j < number.length(); j++) {
                    vladkoBeers += number.charAt(j) - '0';
                }

            }
        }
            long total=mitkoBeers+vladkoBeers;
            if(mitkoBeers>vladkoBeers){
                System.out.print("M"+(mitkoBeers-vladkoBeers));
            }else if(vladkoBeers>mitkoBeers){
                System.out.println("V"+(vladkoBeers-mitkoBeers));
            }else{
                System.out.println("No"+total);
            }





        }



    }

