package com.company.Preparation;

import java.util.Scanner;

public class ShipDamage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rectX1= Integer.parseInt(input.nextLine());
        int rectY1= Integer.parseInt(input.nextLine());
        int rectX2= Integer.parseInt(input.nextLine());
        int rectY2= Integer.parseInt(input.nextLine());
        int lineOffset= Integer.parseInt(input.nextLine());
        int cX1= Integer.parseInt(input.nextLine());
        int cY1= Integer.parseInt(input.nextLine());
        int cX2= Integer.parseInt(input.nextLine());
        int cY2= Integer.parseInt(input.nextLine());
        int cX3= Integer.parseInt(input.nextLine());
        int cY3= Integer.parseInt(input.nextLine());


        int targetX1=0;
        int targetY1=0;
        int targetX2=0;
        int targetY2=0;
        int targetX3=0;
        int targetY3=0;
        int damage=0;

        targetY1=lineOffset+lineOffset-cY1;
        targetX1=cX1;
        targetY2=lineOffset+lineOffset-cY2;
        targetX2=cX2;
        targetY3=lineOffset+lineOffset-cY3;
        targetX3=cX3;

        if((targetX1==rectX1||targetX1==rectX2)&&
                (targetY1==rectY1||targetY1==rectY2)){
            damage+=25;
        }else if(
                (targetX1==rectX1||targetX1==rectX2)&&
                (targetY1>Math.min(rectY1,rectY2)&&targetY1<Math.max(rectY1,rectY2))
                ){
            damage+=50;
        }else if(
                (targetY1==rectY1||targetY1==rectY2)&&
                        (targetX1>Math.min(rectX1,rectX2)&&targetX1<Math.max(rectX1,rectX2))
                ){
            damage+=50;
        }else if(
                (targetX1>Math.min(rectX1,rectX2)&&targetX1<Math.max(rectX1,rectX2))&&
                (targetY1>Math.min(rectY1,rectY2)&&targetY1<Math.max(rectY1,rectY2))
                ){
            damage+=100;
        }
        if((targetX2==rectX1||targetX2==rectX2)&&
                (targetY2==rectY1||targetY2==rectY2)){
            damage+=25;
        }else if(
                (targetX2==rectX1||targetX2==rectX2)&&
                        (targetY2>Math.min(rectY1,rectY2)&&targetY2<Math.max(rectY1,rectY2))
                ){
            damage+=50;
        }else if(
                (targetY2==rectY1||targetY2==rectY2)&&
                        (targetX2>Math.min(rectX1,rectX2)&&targetX2<Math.max(rectX1,rectX2))
                ){
            damage+=50;
        }else if(
                (targetX2>Math.min(rectX1,rectX2)&&targetX2<Math.max(rectX1,rectX2))&&
                        (targetY2>Math.min(rectY1,rectY2)&&targetY2<Math.max(rectY1,rectY2))
                ){
            damage+=100;
        }

        if((targetX3==rectX1||targetX3==rectX2)&&
                (targetY3==rectY1||targetY3==rectY2)){
            damage+=25;
        }else if(
                (targetX3==rectX1||targetX3==rectX2)&&
                        (targetY3>Math.min(rectY1,rectY2)&&targetY3<Math.max(rectY1,rectY2))
                ){
            damage+=50;
        }else if(
                (targetY3==rectY1||targetY3==rectY2)&&
                        (targetX3>Math.min(rectX1,rectX2)&&targetX3<Math.max(rectX1,rectX2))
                ){
            damage+=50;
        }else if(
                (targetX3>Math.min(rectX1,rectX2)&&targetX3<Math.max(rectX1,rectX2))&&
                        (targetY3>Math.min(rectY1,rectY2)&&targetY3<Math.max(rectY1,rectY2))
                ){
            damage+=100;
        }


        System.out.printf("%d%%",damage);

    }
}
