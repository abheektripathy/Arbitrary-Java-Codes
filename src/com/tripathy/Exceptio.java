package com.tripathy;

import java.util.Scanner;

class myex extends Exception{


    public myex(String s){
        super(s);
        System.out.println(s+ "bruh");
    }
}

public class Exceptio {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int sal = sc.nextInt();



        try{
            if (sal<=0) {
                throw new myex("Lmao Dead");
            } else {
                System.out.println("Sal is"+sal);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());

        }

    }
}
