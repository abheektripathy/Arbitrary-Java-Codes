package com.tripathy;

import java.util.Scanner;

class thread extends Thread{


    @Override
    public void run(){


        System.out.println(getName()+getState());

    }


}

public class Multithread1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int UWU = sc.nextInt();

        for(int i=0; i<UWU; i++) {
            thread t1 = new thread();

            t1.start();

        }



    }
}