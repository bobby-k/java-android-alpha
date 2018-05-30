package com.company.Arrays;

        import java.util.Scanner;

public class Indices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        String[] inputNum=input.nextLine().split(" ");
        long[] numbers=new long[n];
        boolean[] empty=new boolean[n];
        for (int i = 0; i <n ; i++) {
            numbers[i] = Integer.parseInt(inputNum[i]);
        }
        long number=0;
        int index=0;


        String result="";
        StringBuilder sb=new StringBuilder();
        sb.append("0 ");
        //System.out.println(resultBuilder.length());

        while(true){
            number=numbers[index];
            empty[index]=true;
            index= (int) number;

            if(index<0||index>numbers.length-1){
                break;
            }
            if(empty[index]){


                int indexReplace=sb.indexOf(" "+index+" ");
                if(indexReplace<0){
                    sb.insert(0,"(");
                }else{
                    sb.replace(indexReplace,indexReplace+1,"(");
                }

                sb.replace(sb.length()-1,sb.length()-1,")");
                System.out.println(sb.toString());
                return;
            }

            sb.append(number).append(" ");
        }
        result=sb.toString().trim();
        System.out.println(result);
    }
}
