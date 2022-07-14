package com.tripathy;

public class multithreadoof {
    public static void main(String[] args) {

        mt object = new mt();
        mt object2 = new mt();
        object.start();
        object2.start();

    }
}


