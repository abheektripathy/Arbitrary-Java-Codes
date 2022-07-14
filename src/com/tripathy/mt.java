package com.tripathy;

import static java.lang.Thread.*;

public class mt extends Thread {

    @Override
    public void run(){

            System.out.println("iisksj");


            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


    }
}

