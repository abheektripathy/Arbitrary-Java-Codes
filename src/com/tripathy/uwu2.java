package com.tripathy;

import java.util.Scanner;

public class uwu2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        Mid M1 = new Mid(num1,num2,num3);
        M1.getMid(num1,num2,num3);
    }

}


class Mid {
    int num1;
    int num2;
    int num3;

    public Mid(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void getMid(int num1,int num2, int num3) {
        int a = Math.max(num1,num2);
        int b = Math.max(num2,num3);

        int c= Math.max(a,b);

        int d= Math.min(num1,num2);
        int e = Math.min(num2,num3);

        int h = Math.min(d,e);

        if(num1!=c && num1!=h) {
            System.out.println("num1 is mid");
        } else if(num2!=c && num2!=h) {
            System.out.println("num2 is mid");
        }else {
            System.out.println("num3 is mid");
        }
    }

}