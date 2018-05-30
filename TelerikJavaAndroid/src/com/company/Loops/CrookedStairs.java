package com.company.Loops;

import java.util.Scanner;

public class CrookedStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long brick1 = Long.parseLong(input.nextLine());
        long brick2 = Long.parseLong(input.nextLine());
        long brick3 = Long.parseLong(input.nextLine());
        int layerNum = Integer.parseInt(input.nextLine());
        System.out.printf("%d%n", brick1);
        System.out.printf("%d %d%n", brick2, brick3);
        for (int col = 3; col <= layerNum; col++) {
            for (int row = 0; row < col; row++) {
            Long brickNext = brick1 + brick2 + brick3;
            brick1 = brick2;
            brick2 = brick3;
            brick3 = brickNext;
            System.out.printf("%d ",brickNext);

        }System.out.println();
    }


    }
}
