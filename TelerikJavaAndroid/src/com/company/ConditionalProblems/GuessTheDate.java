package com.company.ConditionalProblems;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class GuessTheDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year= Integer.parseInt(input.nextLine());
        int month= Integer.parseInt(input.nextLine());
        int day= Integer.parseInt(input.nextLine());

        int dayOut=day-1;
        String monthOut="";
        //if((day==31&&month==1)||(day==31&&month==3)||
               //(day==31&&month==5)||(day==31&&month==7)||
               //(day==31&&month==8)||(day==31&&month==10)||
               //(day==31&&month==12)
        switch(month) {
            case 1:
                monthOut = "Jan";
                break;
            case 2:
                monthOut = "Feb";
                break;
            case 3:
                monthOut = "Mar";
                break;
            case 4:
                monthOut = "Apr";
                break;
            case 5:
                monthOut = "May";
                break;
            case 6:
                monthOut = "Jun";
                break;
            case 7:
                monthOut = "Jul";
                break;
            case 8:
                monthOut = "Aug";
                break;
            case 9:
                monthOut = "Sep";
                break;
            case 10:
                monthOut = "Oct";
                break;
            case 11:
                monthOut = "Nov";
                break;
            case 12:
                monthOut = "Dec";
                break;
        }
        System.out.printf("%d-%s-%d",dayOut,monthOut,year);



    }
}
