package com.tripathy;

import java.util.Scanner;

class uwu extends Thread {
    int oof;
    int mult;

    public uwu(int oof) {
        this.oof= oof;
    }

    @Override
    public void run() {
        for(int i = 1; i<11; i++) {

            int mult = i*oof;
            System.out.println(i+" * "+oof+" = "+mult);
        }
        try{
            sleep(50);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}


public class TablesUwu {
    public static void main(String[] args) {

        uwu u1 = new uwu(7);
        uwu u2 = new uwu(5);
        uwu u3 = new uwu(13);

        u1.start();
        u2.start();
        u3.start();
    }



}
