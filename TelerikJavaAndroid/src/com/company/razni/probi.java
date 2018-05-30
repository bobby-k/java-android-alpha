package com.company.razni;

import java.util.Scanner;

public class probi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        if(str.contains("@")){
            int index=str.indexOf('@');
            System.out.println(index);
            str=str.substring(0,index)+str.substring(index+1);
            System.out.println(str);
        }
    }
}
