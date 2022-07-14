package com.tripathy;

class runn implements Runnable{
    String str1;
    String str2;


    runn(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;

    }

    @Override
    public void run() {
        System.out.println("Creating");

    }
}




public class Multithread2 {

}
