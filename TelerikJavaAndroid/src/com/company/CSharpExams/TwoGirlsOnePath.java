package com.company.CSharpExams;

import java.util.Scanner;

public class TwoGirlsOnePath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split(" ");
        long[] path = new long[str.length];
        for (int i = 0; i < path.length; i++) {
            path[i] = Long.parseLong(str[i]);
        }

        int length = path.length;
        long dollyStep = 0;
        long mollyStep = 0;
        long dollyCurrentIndex=length - 1;
        long dollyFlower = 0;
        long mollyCurrentIndex = 0;
        long mollyFlower = 0;

        boolean draw=false;
        boolean molly=false;
        boolean dolly=false;


        while (true) {
            dollyStep = path[(int) dollyCurrentIndex];
            mollyStep = path[(int) mollyCurrentIndex];

            if (dollyCurrentIndex == mollyCurrentIndex) {
                if (path[(int) dollyCurrentIndex] % 2 != 0) {
                    dollyFlower += dollyStep / 2;
                    mollyFlower += mollyStep / 2;
                    path[(int) dollyCurrentIndex] = 1;
                } else if (path[(int) dollyCurrentIndex] % 2 == 0) {
                    mollyFlower += mollyStep / 2;
                    dollyFlower += dollyStep / 2;
                    path[(int) dollyCurrentIndex] = 0;
                    draw = true;

                }
            } else {

                dollyFlower += dollyStep;
                path[(int) dollyCurrentIndex] = 0;

                mollyFlower += mollyStep;
                path[(int) mollyCurrentIndex] = 0;

                long dollyNextIndex = dollyCurrentIndex - dollyStep;
                while (dollyNextIndex < 0) {
                    dollyNextIndex += length;
                }
                while (dollyNextIndex > length - 1) {
                    dollyNextIndex -= length;
                }

                long mollyNextIndex = mollyCurrentIndex + mollyStep;
                while (mollyNextIndex < 0) {
                    mollyNextIndex += length;
                }
                while (mollyNextIndex > length - 1) {
                    mollyNextIndex -= length;
                }

                if (path[(int) dollyNextIndex] == 0) {
                    mollyFlower+=path[(int)mollyNextIndex];
                    dolly = true;
                    break;
                }

                if (path[(int) mollyNextIndex] == 0) {
                    dollyFlower+=path[(int)dollyNextIndex];
                    molly = true;
                    break;
                }
                dollyCurrentIndex = dollyNextIndex;
                mollyCurrentIndex = mollyNextIndex;


            }
        }
            if(draw){
                System.out.printf("Draw\n");
            }else if(molly){
                System.out.printf("Dolly\n");
            }else if(dolly){
                System.out.printf("Molly\n");
            }
            System.out.print(mollyFlower+" "+dollyFlower);




    }
}
