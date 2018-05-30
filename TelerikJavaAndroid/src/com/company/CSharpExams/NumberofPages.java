package com.company.CSharpExams;

import java.util.Scanner;

public class NumberofPages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digits = Integer.parseInt(input.nextLine());
        int diff = 0;
        int i = 1;
        int count = 0;
        if (digits <= 9) {
            count = digits;
            System.out.println(count);
            return;
        } else {
            while (true) {
                diff = 9 * i * (int) Math.pow(10, i - 1);
                if (digits - diff < 0) {
                    break;
                }
                digits = digits - diff;
                count += diff / i;
                i++;
            }

            count += digits/i;
            System.out.println(count);


        }
    }
}
