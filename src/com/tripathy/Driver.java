package com.tripathy;

interface car{

    int mileage= 0;
    int distance= 0;

    void start();
}

interface person{
    int walkSpeed= 0;

    void walk();
}




class Transformers implements car, person {

    int milleage;




    @Override
    public void start() {

    }

    @Override
    public void walk() {

    }
}


public class Driver {

    public static void main(String[] args){
        Transformers t1 = new Transformers();

        t1.milleage =10;



    }


}
