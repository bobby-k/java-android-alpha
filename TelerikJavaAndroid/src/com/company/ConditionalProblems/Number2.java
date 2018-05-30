package com.company.ConditionalProblems;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String result = "";

            for (int i = 0; ; i++) {
                String str = input.nextLine();
                if (str.equals("print")) {
                    System.out.println(result);
                    continue;
                }
                if (str.equals("front-remove")) {
                    if (result.length() == 0) {
                        System.out.println();
                        continue;
                    } else {
                        result = result.substring(1, result.length());
                        continue;
                    }
                }
                if (str.equals("back-remove")) {
                    if (result.length() == 0) {
                        System.out.println();
                        continue;
                    } else {
                        result = result.substring(0, result.length() - 1);
                        continue;
                    }
                }
                if (str.equals("reverse")) {
                    result = new StringBuilder(result).reverse().toString();
                    continue;
                }
                if (str.contains(" ")) {
                    String[] splitted = str.split("\\s");
                    if (splitted[0].equals("set")) {
                        result = splitted[1];
                        continue;
                    } else if (splitted[0].equals("front-add")) {
                        result = splitted[1] + result;
                        continue;
                    } else if (splitted[0].equals("back-add")) {
                        result = result + splitted[1];
                        continue;
                    }
                }
                if (str.equals("end")) {
                    return;
                }

            }


        }
    }


