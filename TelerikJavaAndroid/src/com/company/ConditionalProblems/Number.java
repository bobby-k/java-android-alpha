package com.company.ConditionalProblems;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";

        for (int i = 0; ; i++) {
             String str = input.nextLine();
            if (str.equals("print")) {
                System.out.println(result);
                    continue;
            } else if (str.contains("front-remove")) {
                if (result.length() == 0) {
                    System.out.println();
                    continue;
                }
                else {
                    result = result.substring(1, result.length());
                    continue;
                }
            }else if (str.contains("back-remove")) {
                if (result.length() == 0) {
                    System.out.println();
                    continue;
                } else {
                    result = result.substring(0, result.length() - 1);
                    continue;
                }
            }
            else if (str.equals("reverse")) {
                result=new StringBuilder(result).reverse().toString();
                continue;
            }
            else if (str.contains(" ")) {

                if (str.contains("set")) {
                    result =str.substring(4, str.length());
                    continue;
                } else if (str.contains("front-add")) {
                    result = str.charAt(str.length()-1) + result;
                    continue;
                } else if (str.contains("back-add")) {
                    result = result + str.charAt(str.length()-1);
                    continue;
                }
            }else if (str.equals("end")) {
                return;
            }


        }


    }
}
