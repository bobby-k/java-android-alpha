package com.company.Numeral;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long decimal=Long.parseLong(input.nextLine());
        int base=2;
        String binaryNum="";
        StringBuilder sb=new StringBuilder(binaryNum);
        do{long residue=decimal%base;
            sb.append(residue);
            decimal/=base;
        }
        while(decimal!=0);

        binaryNum=sb.reverse().toString();
        System.out.println(binaryNum);

    }
}
