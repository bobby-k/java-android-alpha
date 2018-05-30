package com.company.Arrays;

import java.util.Scanner;

public class JoroTheRabbit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputStr=input.nextLine().split(", ");
        int[] arr=new int[inputStr.length];
        for (int i = 0; i <inputStr.length ; i++) {
            arr[i]=Integer.parseInt(inputStr[i]);
            //System.out.println(arr[i]);
        }int currentPath=1;
        int maxPath=0;
        for (int startIndex = 0; startIndex <arr.length ; startIndex++) {
            for (int step = 1; step < arr.length; step++) {
                currentPath=1;
                int index=startIndex;
                int nextIndex=(index+step)%arr.length;
                while((index!=startIndex||nextIndex!=startIndex)&&arr[index]<arr[nextIndex]){
                    currentPath++;
                    index=nextIndex;
                    nextIndex=(index+step)%arr.length;

                }
                maxPath=Math.max(currentPath,maxPath);


            }

        }
        maxPath=Math.max(currentPath,maxPath);
        System.out.println(maxPath);

    }
}
