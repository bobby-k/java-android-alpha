package com.company.Arrays;

import java.util.Scanner;

public class SymetricArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());

        for (int row = 0; row <n ; row++) {
            boolean isSymetric=true;
            String[]str=input.nextLine().split(" ");
            int[]numbers=new int[str.length];
            for (int i = 0; i <str.length ; i++) {
                numbers[i]=Integer.parseInt(str[i]);
            }

            for (int index = 0; index <numbers.length/2 ; index++) {
                if(numbers[index]!=numbers[numbers.length-1-index]){
                    isSymetric=false;
                    break;
                }
            }
            if(isSymetric){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }


        }


    }
}
