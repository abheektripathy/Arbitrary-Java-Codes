package com.tripathy;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InheritanceUwu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        multi m1 = new multi();
        m1.addition(x,y);
        m1.subtraction(x,y);
        m1.special_multiplication(x+y,x-y);
    }
}


class Base {
    int z;
    int x;
    int y;


    public void addition(int x,int y) {
        int z = x+y;
        System.out.println("The sum is " + z);

    }
    public void subtraction(int x , int y) {
        int z2 = x-y;
        System.out.println("The difference is "+ z2 );


    }


}

class multi extends Base {
    int h;

    public void special_multiplication(int z,int z2) {
        int h = z*z2;
        System.out.println("the multi is" + h);

    }

}