package com.company.razni;

import java.util.Scanner;

public class proba4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= Integer.parseInt(input.next());
        int b= Integer.parseInt(input.next());
        int diff=Math.abs((a-b));
        System.out.println(diff);

    }
}
