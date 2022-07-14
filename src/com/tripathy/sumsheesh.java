package com.tripathy;

import java.util.Scanner;

public class sumsheesh {
    public static int summer(int a, int b) {
        int c = a+b;
        return c;


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(summer(x,y));

    }

}
