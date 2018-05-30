package com.company.razni;

public class yyy {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for (int i = 10; i <20 ; i++) {
            sb.append(i);
            sb.append(" ");


        }sb.append(16);
        String result=sb.toString();
        System.out.println(result);

        String a="16";
            int replaceIndex=sb.indexOf(a);
            sb.replace(replaceIndex-1,replaceIndex,"(");
            System.out.println(sb.toString());



    }
}
