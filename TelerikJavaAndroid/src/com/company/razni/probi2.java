package com.company.razni;

import java.util.Scanner;

public class probi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        long fact = 1;
        do {
            fact = fact * n;
            n--;
        } while (n > 1);
        System.out.println(fact);
    }
}
