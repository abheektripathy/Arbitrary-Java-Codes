package com.tripathy;

import java.util.Scanner;

public class factorial {
    public static void factorial(int a) {
        int multiple = 1;
        for(int i=a; i>=1; i-- ) {
            multiple = multiple*i ;

        }
        System.out.println(multiple);



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        factorial(x);



    }

}
