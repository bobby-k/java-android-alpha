package com.company.Preparation;

import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short n = Short.parseShort(input.nextLine());
        short count = 0;
        for (short bear = 0; bear <= n; bear += 2) {
            for (short human = 0; human <= n - bear; human += 5) {
                for (short chicken = 0; chicken <= n - bear - human; chicken += 7) {

                if (n==bear+human+chicken) {
                    count++;
                }

            }

        }
    }

        System.out.println(count);

    }
}
