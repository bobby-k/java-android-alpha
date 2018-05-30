package com.company.Arrays;
import java.util.Scanner;

public class Kitty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] moveStr = input.nextLine().split(" ");
        long[] moveInt = new long[moveStr.length];
        for (int i = 0; i < moveStr.length; i++) {
            moveInt[i] = Integer.parseInt(moveStr[i]);
            //System.out.println(moveInt[i]);
        }
        int moves = 0;
        int count = 0;
        int countSoul = 0;
        int countFood = 0;
        int countDeadLocks = 0;
        String result = "";
        char[] ch = new char[str.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
        }
        String resultStr = "" + ch[0];
        if(ch[0]=='x'){
            System.out.println(String.format("You are deadlocked, you greedy kitty!\n" +
                    "Jumps before deadlock: %d", count));
            return;
        }
        for (int i = 0; i < moveInt.length; i++) {
            moves += moveInt[i];
            if(ch[0]=='@'){
                countSoul++;
                ch[0]='\u0000';
            }else if(ch[0]=='*'){
                countFood++;
                ch[0]='\u0000';
            }

            while (moves > str.length()-1) {
                moves -= str.length();
            }
            while (moves < 0) {
                moves += str.length();
            }if(ch[moves]=='\u0000'){
                count++;
            }
            else if (ch[moves] == '@') {
                resultStr += ch[moves];
                countSoul++;
                count++;
                ch[moves] = '\u0000';
            } else if (ch[moves] == '*') {
                resultStr += ch[moves];
                countFood++;
                count++;
                ch[moves] = '\u0000';
            } else if (ch[moves] == 'x' && moves % 2 == 0) {
                if (resultStr.contains("@")) {
                    countSoul--;
                    count++;
                    countDeadLocks++;
                    ch[moves] = '@';
                } else {
                    count++;
                    result = String.format("You are deadlocked, you greedy kitty!\n" +
                            "Jumps before deadlock: %d", count);
                    break;
                }
            } else if (ch[moves] == 'x' && moves % 2 != 0) {
                if (resultStr.contains("*")) {
                    countFood--;
                    count++;
                    countDeadLocks++;
                    ch[moves] = '*';
                } else {
                    count++;
                    result = String.format("You are deadlocked, you greedy kitty!\n" +
                            "Jumps before deadlock: %d", count);
                    break;

                }

            }

        }
        if (count < moveInt.length) {
            System.out.println(result);

        } else {
            System.out.println(String.format("Coder souls collected: %d%n Food collected: %d%n Deadlocks: %d%n",
                    countSoul, countFood, countDeadLocks));
        }


    }
}
